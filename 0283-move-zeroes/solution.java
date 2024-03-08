class Solution {
    public void moveZeroes(int[] nums) {
        int numZeros = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) numZeros++;
            else nums[i - numZeros] = nums[i];
            if (numZeros > 0 )nums[i] = 0;
        }
    }
}
