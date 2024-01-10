import java.lang.StringBuilder;

class Solution {
    public String reverseWords(String s) {
       String reversed = reverseString(s);
       String res = "";
       for (int i = 0; i < reversed.length(); i++) {
           if ((Character.isLetter(reversed.charAt(i)) || Character.isDigit(reversed.charAt(i)))) {
               String toAdd = "";
               while (i < reversed.length() && (Character.isLetter(reversed.charAt(i)) || Character.isDigit(reversed.charAt(i)))) {
                   toAdd = reversed.charAt(i) + toAdd;
                   i++;
               }
               res += toAdd + " "; 
           }
       }
       return res.trim();
    }

    private static String reverseString(String str) {
        // Create a StringBuilder object with the given string
        StringBuilder stringBuilder = new StringBuilder(str);

        // Use the reverse() method to reverse the string
        stringBuilder.reverse();

        // Convert the StringBuilder back to a string
        return stringBuilder.toString();
    }


}
