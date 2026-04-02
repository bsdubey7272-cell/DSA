
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1, high = n;
        
        while (low <= high) {
           int mid=low + (high - low) / 2;
            int val = guess(mid);
            
            if (val == -1) {
                high = mid - 1;
            } else if (val == 1) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        
        return -1; 
    }
}
