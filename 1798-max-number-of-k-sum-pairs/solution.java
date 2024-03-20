import java.util.HashMap;
class Solution {
   public static int maxOperations(int[] nums, int k) {
        //add all values to a hasmap such that there value is the key, and their index is the value.
        HashMap<Integer, Integer> vals = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!vals.containsKey(num)) {
                vals.put(num, 1);
            } else {
                vals.put(num, vals.get(num) + 1);
            }
        }

        int result = 0;
        //next, go through list and see if a matching number exists for each number, if it does, set both numbers to infinity
        for (int j = 0; j < nums.length; j++) {
            if (vals.containsKey(k - nums[j]) && nums[j] == k - nums[j] && vals.get(nums[j]) >= 2) {
                vals.put(nums[j], vals.get(nums[j]) - 2);
                result++;
            }
            else if (nums[j] != k - nums[j] && vals.containsKey(k - nums[j]) && vals.get(nums[j]) > 0 && vals.get(k - nums[j]) > 0) {
                vals.put(nums[j], vals.get(nums[j]) - 1);
                vals.put(k - nums[j], vals.get(k - nums[j]) - 1);
                result++;
            }
        }
        return result;
    }
}
