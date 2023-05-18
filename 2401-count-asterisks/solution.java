class Solution {
    public int countAsterisks(String s) {
        if (s == null) return 0;
        int numOfBars = 0;
        int countOfAsterics = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') numOfBars++;
            if (numOfBars % 2 == 0) {
                if (s.charAt(i) == '*') countOfAsterics++;
            }
        }
        return countOfAsterics;
    }
}
