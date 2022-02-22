// Pattern 9
import java.util.*;
/* Problem : Print the following pattern:
I/P: 5
O/P:
*				*	
	*		*		
		*			
	*		*		
*				*	
Solution: Print the combination of both the patterns i.e. Pattern 7 and Pattern 8 by adding || [OR] condition and print the stars*/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(i == j || i + j == n + 1)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
                
            }
            System.out.println();
        }

        // write ur code here

    }
}