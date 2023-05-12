class Solution {
   public static String longestPalindrome(String s) {
        //go through every substring. check if it is a palindrome. keep track of currMax and currMax owner
      int currMax = 0;
      int currMaxInd1 = -1;
      int currMaxInd2 = -1;
      for (int i = 0; i < s.length(); i++) {
         for (int j = i; j < s.length(); j++) {
                //check if palindrome

            if (j - i + 1 < currMax) continue;
            if (s.charAt(i) != s.charAt(j)) 
               continue;
            else {
               int count = 0;
               for (int x = 0; x < j - i + 1; x++) {
                  char z = s.charAt(i + x);
                  char y = s.charAt(j - x);
                  if (s.charAt(i + x) == s.charAt(j - x)) count++;
               }
               if (count == j - i + 1) {
                  if (count > currMax) {
                     currMaxInd1 = i;
                     currMaxInd2 = j;
                     currMax = j - i + 1;
                  }
               }
            }
         }
      }
      return s.substring(currMaxInd1, currMaxInd2 + 1);
   }
}


