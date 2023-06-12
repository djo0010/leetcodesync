class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isLetter(s.charAt(i))) {
                while (i >= 0 && Character.isLetter(s.charAt(i))) {
                    count++; i--;
                }
                return count;
            }
        }
        return count;
    }
}
