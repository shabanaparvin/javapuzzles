import java.lang.*;
import java.util.Scanner;
 
public class ConsecutiveSum 
{    
    // Utility method to compute number of ways
    // in which N can be represented as sum of 
    // consecutive number
    static int countConsecutive(int N)
    {
        // constraint on values of L gives us the 
        // time Complexity as O(N^0.5)
        int count = 0;
        for (int L = 1; L * (L + 1) < 2 * N; L++)
        {
            float a = (float) ((1.0 * N-(L * (L + 1)) / 2) / (L + 1));
            if (a-(int)a == 0.0) 
                count++;        
        }
        return count;
    }
     
    
    public static void main(String[] args) {
		int N;
		Scanner in = new Scanner(System.in);
 		System.out.println("Enter an Number");
		N = in.nextInt();
		System.out.println("Number of ways "+ N +" can be represented as sum of consective num is : "+countConsecutive(N));
     }
}
