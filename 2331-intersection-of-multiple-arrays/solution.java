class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> res = new ArrayList<Integer>();
        int[] array = nums[0];
        Arrays.sort(array);
        nums[0] = array;
        
        for (int i = 0; i < nums[0].length; i++) {
            int search = nums[0][i];
            int count = 0;
            
            for (int j = 1; j < nums.length; j++) {
                
                for (int k = 0; k < nums[j].length; k++) {
                    if (nums[j][k] == search) {
                        count++;
                        k = nums[j].length + 1;
                        continue;
                    }
                }
            }
        if (count == nums.length - 1) res.add(search);
        }
    return res;
    }
}
