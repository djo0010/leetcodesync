class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        boolean positive = true;
        int positiveFinder = 0;
        int negativeFinder = 0;
        int index = 0;
        while (index < nums.length) {
            if (positive) {
                while (nums[positiveFinder] < 0) {
                    positiveFinder++;
                }
                res[index] = nums[positiveFinder];
                positiveFinder++;
                
            }
            else {
                while (nums[negativeFinder] > 0) {
                    negativeFinder++;
                }
                res[index] = nums[negativeFinder];
                negativeFinder++;
                
            }
            index++;
            positive = !positive;
        } 
        return res;
    }
}
