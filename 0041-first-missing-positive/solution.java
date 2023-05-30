class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> vals = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            vals.add(nums[i]);
        }
        for (int j = 1; j < Integer.MAX_VALUE; j++) {
            if (!vals.contains(j)) return j;
        }
        return -1;
    }
}
