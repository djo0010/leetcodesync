import java.util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();
        for (int a = 0; a < s.length(); a++) {
            sMap.merge(s.charAt(a), 1, Integer::sum);
            tMap.merge(t.charAt(a), 1, Integer::sum);
        }
        return (sMap.equals(tMap));
        
    }
}
