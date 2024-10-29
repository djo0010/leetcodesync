class Solution {
    public int arrangeCoins(int n) {
        return (int) ((-1 + Math.sqrt(1 + 4L * 2L * n)) / 2L);
    }
}
