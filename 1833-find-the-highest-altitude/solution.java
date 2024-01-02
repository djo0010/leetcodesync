class Solution {
    public int largestAltitude(int[] gain) {
     int currMax = 0;
     int currAltitude = 0;
     for (int i = 0; i < gain.length; i++) {
        currAltitude += gain[i];
        if (currAltitude > currMax) currMax = currAltitude;
     }   
     return currMax;
    }
}
