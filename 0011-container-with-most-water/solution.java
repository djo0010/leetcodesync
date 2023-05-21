class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxHeight = calculateArea(height, l, r);
        
        while (l < r) {
            if (height[l] < height[r]) l++;
            else if (height[r] < height[l]) r--;
            else l++;
            int curr = calculateArea(height, l, r);
            maxHeight = Math.max(curr, maxHeight);
        }
        return maxHeight;
    }

    private int calculateArea(int[] array, int indexL, int indexR) {
        int height = Math.min(array[indexL], array[indexR]);
        int width = indexR - indexL;
        return height * width;
    }
}
