import java.util.HashSet;
class Solution {
   public static int partitionString(String s) {
      HashSet<Character> tester = new HashSet<>();
      int count = 0;
      for (int i = 0; i < s.length(); i++) {
         if (!tester.contains(s.charAt(i))) tester.add(s.charAt(i));
         else {
            tester.clear();
            i--;
            count++;
         }
      }    
      return count + 1;
   }
}
