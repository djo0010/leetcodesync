class Solution {
   public String freqAlphabets(String s) {
      HashMap<String, Character> values = new HashMap<>();
      String res = "";
      for (int i = 1; i < 27; i++) {
         int asci = 97 + i - 1;
         values.put(String.valueOf(i), (char) asci);
      }
      
      for (int i = s.length() - 1; i >= 0; i--) {
         if (s.charAt(i) == '#') {
            res = values.get(s.substring(i - 2, i)) + res;
            i -= 2;
         }
         else {
            String temp = s.substring(i, i + 1);
            res = values.get(temp) + res;
         }
      }
      return res;
   }
}
