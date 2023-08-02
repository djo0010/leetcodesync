class Solution {
    public int searchInsert(int[] nums, int target) {
       int l = 0;
        int r = nums.length - 1;
        int m = (l + r) / 2;
        while (nums[m] != target) {
            int tmpM = m;

            if (nums[m] < target) l = m + 1;
            else if (nums[m] > target) r = m - 1;

            m = (l + r) / 2;
            if (tmpM == m) return l;
        }
        return m;
    }
}
