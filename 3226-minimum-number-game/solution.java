class Solution {
    public int[] numberGame(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.sort(nums);
        int j = 0;
        for (int i = 0; i < res.length; i++) {
            res[i] = nums[j + 1];
            i++;
            res[i] = nums[j];
            j += 2;

        }
        return res;
    }
}
