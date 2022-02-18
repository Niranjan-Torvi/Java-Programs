import java.util.*;

public class Main {
    // Problem Statement: Print the given pattern
    // Solution: For the given pattern Ex- n = 5 so in for loop i = 5 so pointer will go in j loop and j = 1 and j = i so it will print *****. Then i gets decremented and now i = 4 so again the pointer goes in j loop and j = 1 and j <=4 so prints **** stars. Then again i gets decremented to 3 and then i = 3 so it goes in j loop and j = 1 and j <= 3 so it prints *** stars. Then i gets decremented to 2 and goes in j loop and j = 1 and j <= 2 so it prints ** and then * in the same way.
    // I/P: 5
    /* O/P:  *	  *	*	*	*	
             *	  *	*	*	
             *	  *	*	
             *	  *	
             *	                                                                          */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }

        

    }
}