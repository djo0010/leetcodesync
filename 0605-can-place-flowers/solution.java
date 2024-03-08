class Solution {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && check(flowerbed, i)) {
                count++;
                i++;
            }
        }
        if (count >= n) return true;
        return false;
    }

    private static boolean check(int[] array, int index) {
        //3 conditions - middle check, left check, right check, single index check
        if (index - 1 < 0 && index + 1 < array.length && array[index + 1] == 0) return true;  //left check
        else if (index - 1 < 0 && index + 1 < array.length && array[index + 1] == 1) return false;
        else if (index + 1 == array.length && index - 1 > 0 && array[index - 1] == 0) return true; //right check
        else if (index + 1 == array.length && index - 1 > 0 && array[index - 1] == 1) return false;
        else if (index + 1 == array.length && index - 1 < 0) return true; //single index check
        else if (array[index - 1] == 0 && array[index + 1] == 0) return true; //middle check
        return false;
    }
}
