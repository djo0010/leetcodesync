import java.math.BigInteger;

class Solution {
   public static int uniquePaths(int m, int n) {
        //combinatorics. n + m choose m
      int nVal = n + m - 2;
      int rVal = m - 1;
      BigInteger top = factorial(nVal);
      BigInteger left = factorial(rVal);
      BigInteger right = factorial(nVal - rVal);
      BigInteger res = top.divide(left.multiply(right));
      return res.intValue();
   }

   private static BigInteger factorial(int val) {
      BigInteger one = BigInteger.valueOf(1);
      BigInteger value = BigInteger.valueOf(val);
      while (!value.equals(BigInteger.ZERO)) {
         one = one.multiply(value);
         value = value.subtract(BigInteger.ONE);
      }
      return one;
   }
   
   public static void main(String[] args) {
      
      System.out.println(uniquePaths(10, 10));
   }
}
