class Solution {
   public static int[] productExceptSelf(int[] nums) {
      int totalProduct = 1;
      boolean noZeros = true;
      boolean allZeros = false;
      int zeroCount = 0;
      int[] res = new int[nums.length];
      for (int i = 0; i < nums.length; i++) {
         if (nums[i] != 0) {
            totalProduct *= nums[i];
            continue;
         }
         zeroCount++;
         noZeros = false;
      }
      if (zeroCount > 1) {
         return res;
      }
      
      for (int j = 0; j < nums.length; j++) {
         if (noZeros == false && nums[j] != 0) {
            res[j] = 0;
            continue;
         }
         if (noZeros == false && nums[j] == 0) {
            res[j] = totalProduct;
            continue;
         }
         res[j] = totalProduct / nums[j];
      }
      return res;
   }
    
   public static void main(String[] args) {
      int[] test = {0,4,0};
      int[] res = Solution.productExceptSelf(test);
      for (int i = 0; i < res.length; i++) {
         System.out.println(res[i]);
      }
   }
}
