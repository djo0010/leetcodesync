import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> vals = new HashSet<Integer>();
        for (int a : nums) {
            if (vals.add(a) == false) {
                return true;
            }
        }
        return false;
    }
}
