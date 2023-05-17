import java.util.HashMap;
class Solution {
   public static int[] topKFrequent(int[] nums, int k) {
      
      HashMap<Integer, Integer> vals = new HashMap<>();
   
      for (int a = 0; a < nums.length; a++) {
      
         if (vals.containsKey(nums[a])) {
            vals.put(nums[a], vals.get(nums[a]) + 1);
         }
         else {
            vals.put(nums[a], 1);
         }
      }
      int[] res = new int[k];
      for (int i = 0; i < k; i++) {
         int max = Solution.getMax(vals);
         vals.remove(max);
         res[i] = max;
      }
      return res;
   }
   
   public static void main(String[] args) {
      int[] test = {1,1,1,2,2,3};
      int[] res = Solution.topKFrequent(test, 2);
      for (int i = 0; i < res.length; i++) {
         System.out.println(res[i]);
      }
   }

   private static int getMax(HashMap<Integer, Integer> in) {
      int currMax = Integer.MIN_VALUE;
      int currMaxKey = Integer.MIN_VALUE;;
      for (Integer item : in.keySet()) {
         if (in.get(item) > currMax) {
            currMax = in.get(item);
            currMaxKey = item;
         }
      }
      return currMaxKey;
   }
}
