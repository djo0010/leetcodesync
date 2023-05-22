import java.util.ArrayList;
class Solution {
   public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int l1 = 0;
      int l2 = 0;
      int count = 0;
      double valueToReachFirst = ((double)nums1.length + (double)nums2.length) / 2.0;
      boolean twoValues = false;
      int valuesToReach1 = -1;
      int valuesToReach2 = -1;
      if (valueToReachFirst - (int)valueToReachFirst == 0) {
         valuesToReach1 = (int)valueToReachFirst - 1;
         valuesToReach2 = valuesToReach1 + 1;
         twoValues = true;
      }
      int valueToReach = (int)valueToReachFirst;
      ArrayList<Double> halfWayArray = new ArrayList<Double>();
      double res = 0;
   
      if (twoValues) {
         while (count <= valuesToReach2) {
            double num1 = Integer.MIN_VALUE;
            double num2 = Integer.MIN_VALUE;
            if (l1 < nums1.length) {
               num1 = nums1[l1];
            }
            if (l2 < nums2.length) {
               num2 = nums2[l2];
            }
            if (num1 == Integer.MIN_VALUE) {
               halfWayArray.add(num2);
               count++;
               l2++;
            } 
            else if (num2 == Integer.MIN_VALUE) {
               halfWayArray.add(num1);
               count++;
               l1++;
            }
            else if (num1 > num2) {
               halfWayArray.add(num2);
               count++;
               l2++;
            }
            else if (num1 < num2) {
               halfWayArray.add(num1);
               count++;
               l1++;
            }
            else {
               halfWayArray.add(num1);
               halfWayArray.add(num2);
               l1++;
               l2++;
               count++;
               count++;
            }
         }
         res = (halfWayArray.get(valuesToReach2) + halfWayArray.get(valuesToReach2 - 1)) /2;
      }
      else {
         while (count <= valueToReach) {
            double num1 = Integer.MIN_VALUE;
            double num2 = Integer.MIN_VALUE;
            if (l1 < nums1.length) {
               num1 = nums1[l1];
            }
            if (l2 < nums2.length) {
               num2 = nums2[l2];
            }
            if (num1 == Integer.MIN_VALUE) {
               halfWayArray.add(num2);
               count++;
               l2++;
            } 
            else if (num2 == Integer.MIN_VALUE) {
               halfWayArray.add(num1);
               count++;
               l1++;
            }
            else if (num1 > num2) {
               halfWayArray.add(num2);
               count++;
               l2++;
            }
            else if (num1 < num2) {
               halfWayArray.add(num1);
               count++;
               l1++;
            }
            else {
               halfWayArray.add(num1);
               halfWayArray.add(num2);
               l1++;
               l2++;
               count++;
               count++;
            }
         }
         res = halfWayArray.get((int)valueToReach);
      }
      return res;
   }
   
   public static void main(String[] args) {
      int[] test1 = {0,0,0,0,0};
      int[] test2 = {2,4};
      System.out.println(findMedianSortedArrays(test1, test2));
   }
}
