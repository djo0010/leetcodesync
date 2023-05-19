class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 1;
        int tens = 0;
        if (bills[0] != 5) return false;

        for (int i = 1; i < bills.length; i++) {
            if (bills[i] == 5) {
                fives++;
            }
            else if (bills[i] == 10) {
                fives--;
                if (fives < 0) return false;
                tens++;
            }
            else {
                if (tens == 0) {
                    fives -= 3; 
                    if (fives < 0) return false;
                }
                else {
                    tens--;
                    if (tens < 0) return false;
                    fives--;
                    if (fives < 0) return false;
                }
            }
        }
        return true;
    }
}
