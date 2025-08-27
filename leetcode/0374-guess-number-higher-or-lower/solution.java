/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int num=0;
        int l=0,r=n;

        while(l<r){
            num = l + (r-l)/2;
            int p = guess(num);

            if(p == 1){
                l=num+1;
            } else if(p == -1){
                r=num-1;
            } else{
                return num;
            }
        }

        return l;
        
    }
}
