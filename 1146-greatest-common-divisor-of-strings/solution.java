class Solution {
    public static String gcdOfStrings(String str1, String str2) {
        String result = "";
        String divisor = "";
        for (int i = 0; i < str1.length(); i++) {
            divisor += str1.charAt(i);
            if (str1.length() % divisor.length() != 0 || str2.length() % divisor.length() != 0) continue;
            String test = "";
            while (test.length() < str1.length() && str1.contains(test)) test += divisor;
            if (!test.equals(str1)) continue;
            test = "";
            while (test.length() < str2.length() && str2.contains(test)) test += divisor;
            if (test.equals(str2)) {
                result = "";
                result += divisor;
            }
        }
        return result;
    }
}
