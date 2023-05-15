class Solution {
   public static String reverseVowels(String s) {
      int leftInd = 0;
      int rightInd = s.length() - 1;
      char[] res = new char[s.length()];
      
      while (leftInd <= rightInd) {
         char leftChar = s.charAt(leftInd);
         char rightChar = s.charAt(rightInd);
         if (!isVowel(leftChar)) {
            res[leftInd] = leftChar;
            leftInd++;
         }
         else if (!isVowel(rightChar)) {
            res[rightInd] = rightChar;
            rightInd--;
         }
         else {
            res[leftInd] = rightChar;
            res[rightInd] = leftChar;
            leftInd++;
            rightInd--;
         }
      }
      return new String(res);
   }
   
   private static boolean isVowel(char c) {
      return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
   }
}

