// Pattern 4
import java.util.*;

public class Main {
/* Problem: Print the following pattern:
   Solution: For this pattern in first for loop i = n i.e. 5 so it will go in the j loop and check that j = 1 and j <= space where space = 0 then it will go to next j loop and see that j = 1 and j <= stars where stars are declared above as n i.e. 5 so in the first line it will print 5 stars and o spaces and then stars-- and spaces++.
   Then in next line i-- so it i will become 4 j = 1 and j <= space where space is 1 now in next j loop j = 1 and j <= stars where stars are 4 so it will print 1 space and 4 stars and stars-- and space++.
   Then in next line i-- so it i will become 3 j = 1 and j <= space where space is 2 now in next j loop j = 1 and j <= stars where stars are 3 so it will print 2 space and 3 stars and stars-- and space++.
   Then in next line i-- so it i will become 2 j = 1 and j <= space where space is 3 now in next j loop j = 1 and j <= stars where stars are 2 so it will print 3 space and 2 stars and stars-- and space++.
   Then in next line i-- so it i will become 1 j = 1 and j <= space where space is 4 now in next j loop j = 1 and j <= stars where stars are 1 so it will print 4 space and 1 stars and stars-- and space++.   
   I/P - 5
   O/P- 
    *	  *	*     *	    *	
	  *	*     *	    *	
		*     *	    *	
		      *	    *	
		            *	                                       */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stars = n;
        int space = 0;

        for(int i = n; i >= 1; i--)
        {
            for(int j = 1; j <= space; j++)
            {
                System.out.print("\t");
            }
            for(int j = 1; j <= stars; j++)
            {
                System.out.print("*\t");
            }
            

            stars--;
            space++;
            System.out.println();
        }


        // write ur code here

    }
}