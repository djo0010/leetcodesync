class Solution {
    public static String mergeAlternately(String word1, String word2) {
        return mergeAlternatelyHelper(word1, word2, 0, "");
    }

    private static String mergeAlternatelyHelper(String word1, String word2, int index, String result) {
        if (index >= word1.length() && index >= word2.length()) return result;
        else if (index >= word1.length()) {
            return mergeAlternatelyHelper(word1, word2, index + 1, result + word2.charAt(index));
        }
        else if (index >= word2.length()) {
            return mergeAlternatelyHelper(word1, word2, index + 1, result + word1.charAt(index));
        }
        else {
            return mergeAlternatelyHelper(word1, word2, index + 1, result + word1.charAt(index) + word2.charAt(index));
        }
    }
}
