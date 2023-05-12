import java.util.HashMap;
class Solution {
   public static int minimumRounds(int[] tasks) {
      HashMap<Integer, Integer> map = new HashMap<>();
      for (int i = 0; i < tasks.length; i++) {
         if (map.containsKey(tasks[i])) {
            map.put(tasks[i], map.get(tasks[i]) + 1);
         } else {
            map.put(tasks[i], 1);
         }
      }
      int count = 0;
      int countOfZeros = 0;
      for (Integer key : map.keySet()) {
         int value = map.get(key);
         if (value < 2) 
            return -1;
         
         if (value % 3 == 0) {
            count += value / 3;
            continue;
         }
         int tmp = 0;
         
         while (value > 4) {
            count++;
            value -= 3;
         }
         while (value >= 2) {
            tmp = value / 2;
            count += tmp;
            value -= 2 * tmp;
         }
      }
      return count;
   
   }
      
      
   
   public static void main(String[] args) {
      int[] tests = {2,2,3,3,2,4,4,4,4,4};
      System.out.println(Solution.minimumRounds(tests));
   }
}
