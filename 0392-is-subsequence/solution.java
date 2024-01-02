class Solution {
    public boolean isSubsequence(String s, String t) {
        int sPoint = 0;
        int sLength = s.length();

        for (int i = 0; i < t.length() && sPoint < sLength; i++)      {
            if (s.charAt(sPoint) == t.charAt(i)) {
                sPoint++;
            }
        }
        return sPoint == sLength;
    }
}
