class Solution {
   public static void merge(int[] nums1, int m, int[] nums2, int n) {
      while (m >= 1 || n >= 1) {
         if (m >= 1 && n >= 1) {
            if (nums1[m - 1] > nums2[n - 1]) {
               nums1[m + n - 1] = nums1[m - 1];
               m--;
            }
            else {
               nums1[m + n - 1] = nums2[n - 1];
               n--;
            }
         }
         else if (m >= 1 && n < 1) {
            nums1[m + n - 1] = nums1[m - 1];
            m--;
         }
         else {
            nums1[m + n - 1] = nums2[n - 1];
            n--;
         }
      }
   }
}

