class Solution {
    public int lengthOfLongestSubstring(String s) {
     if (s.length() == 0) 
         return 0;
      if (s.length() == 1) 
         return 1;
      int l = 0;
      int r = 0;
      HashSet<Character> distincts = new HashSet<Character>();
      int count = 0;
      int currMax = 0;
      while (l < s.length() && r < s.length()) {
         distincts.add(s.charAt(r));
      
         if (distincts.size() == r - l + 1) {
            count = r - l + 1;
            if (count > currMax) currMax = count;
            r++;
         }
         else {
            distincts.remove(s.charAt(l));
            l++; 
         }
      
      }
      return currMax;
   
    }
}
