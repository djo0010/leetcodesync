class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
    int[][] ans = new int[image.length][image[0].length];
    for (int i = 0; i < image.length; i++) {
        for (int j = 0; j < image.length; j++) {
            ans[i][image.length - 1 - j] = (image[i][j] == 1 ? 0 : 1);
        }
        }
    return ans;
    }
}
    
