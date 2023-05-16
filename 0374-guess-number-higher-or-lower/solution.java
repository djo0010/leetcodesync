/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

import java.util.Random;
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        Random random = new Random();
        int guessNum = random.nextInt(n - 1 + 1) + 1;
        int guessVal = guess(guessNum);
        int lowBound = 1;
        int highBound = n;
        while (guessVal != 0) {
            if (guessVal == 1) {
                lowBound = guessNum;
                guessNum = random.nextInt(highBound - lowBound + 1) + lowBound;
                guessVal = guess(guessNum);
            }
            else {
                highBound = guessNum;
                guessNum = random.nextInt(highBound - lowBound + 1) + lowBound;
                guessVal = guess(guessNum);
            }
        }
        return guessNum;
    }
}
