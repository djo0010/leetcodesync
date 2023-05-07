import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> myMap = new HashMap<>();

        int[] res = new int[2];

        myMap.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            int value = target - nums[i];
            if (myMap.containsKey(value)) {
                int index = myMap.get(value);
                res[0] = index;
                res[1] = i;
                return res;
            }
            myMap.put(nums[i], i);
        }
        return res;
    }
}
