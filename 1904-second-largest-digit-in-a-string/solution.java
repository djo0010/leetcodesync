class Solution {
    public int secondHighest(String s) {
        int currMax = Integer. MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) && Character.getNumericValue(s.charAt(i)) > currMax) {
                currMax = Character.getNumericValue(s.charAt(i));
            }
        }

        int res = Integer. MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) && Character.getNumericValue(s.charAt(i)) < currMax && Character.getNumericValue(s.charAt(i)) > res) {
                res = Character.getNumericValue(s.charAt(i));
            }
        }

        if (res != Integer. MIN_VALUE) return res;
        return -1;

    }
}
