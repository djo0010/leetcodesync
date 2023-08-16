class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int currMax = candies[0];

        for (int i = 1; i < candies.length; i++) {
            currMax = Math.max(candies[i], currMax);
        }

        List<Boolean> res = new ArrayList<Boolean>();

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= currMax) {
                res.add(true);
            }
            else {
                res.add(false);
            }
        }

        return res;
    }
}
