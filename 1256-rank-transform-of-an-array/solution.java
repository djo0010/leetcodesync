class Solution {
    public static int[] arrayRankTransform(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        int shiftDown = 0;
        HashMap<Integer, int[]> vals = new HashMap<Integer, int[]>();
        for (int j = 0; j < copy.length; j++) {
            if (!vals.containsKey(copy[j])) {
                int[] indexAndShift = {j + 1, shiftDown};
                vals.put(copy[j], indexAndShift);
            }
            else {
                int[] indexAndShift = vals.get(copy[j]);
                shiftDown++;
                indexAndShift[0] = j + 1;
                indexAndShift[1] = shiftDown;
                vals.put(copy[j], indexAndShift);

            }
        }
        for (int i = 0; i < arr.length; i++) {
            int indexShift = vals.get(arr[i])[1];
            arr[i] = vals.get(arr[i])[0] - indexShift;
        }
        return arr;
    }
}
