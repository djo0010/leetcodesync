class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            if (this.isSelfDividing(i)) res.add(i);
        }
        return res;
    }

    private static boolean isSelfDividing(int number) {
        int originalNumber = number;
        while (number > 0) {
            int indexedNumber = number % 10;
            if (indexedNumber == 0) return false;
            number /= 10;
            if (originalNumber % indexedNumber != 0) return false;
        }
        return true;
    }
}
