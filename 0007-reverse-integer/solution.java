import java.lang.StringBuilder;
class Solution {
    public int reverse(int x) {
        try {
        if (x < 0) {
            String currString = Integer.toString(x);
            return Integer.parseInt("-" + new StringBuilder(currString.substring(1, currString.length())).reverse().toString());
        }
        return Integer.parseInt(new StringBuilder(Integer.toString(x)).reverse().toString());
        }
        catch (Exception e) {
            return 0;
        }
    }
}
