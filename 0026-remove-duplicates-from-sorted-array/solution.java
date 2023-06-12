import java.util.HashSet;
class Solution {
    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> vals = new HashSet<Integer>();
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (vals.contains(nums[j])) continue;
            else {
                vals.add(nums[j]);
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
