// Pattern 6
import java.util.*;
/* Problem: Print the following pattern
I/P : 5
O/P:
*	*	*		*	*	*	
*	*				*	*	
*						*	
*	*				*	*	
*	*	*		*	*	*	

   Solution:  For n = 1 declare stars as n / 2 + 1 i.e. 3 stars and declare spaces as 1 initially. For 1st row i.e. i = 1 j = 1 to j <= starsi.e. 3 will get printed and one space will get printed and again n / 2 + 1 will get printed as we have declared 3 loops 1st for stars 2nd for spaces and 3rd again for stars and then by if loop as i<= n /2 i.e. 1st row so stars decrements and space increments by 2.
              For n = 2 declare 2 stars[decremented after 1st loop] and declare spaces as 3[incremented in 1st loop]. For 2nd row i.e. i = 2 j = 1 to j <= starsi.e. 2 will get printed and three spaces will get printed and again 2 stars will get printed as we have declared 3 loops 1st for stars 2nd for spaces and 3rd again for stars then by if loop as i<= n /2 i.e. 2nd row so stars decrements and space increments by 2.
               For n = 3 declare 1 star[decremented after 2nd loop] and declare spaces as 5[incremented in 2nd loop]. For 3rd row i.e. i = 3 j = 1 to j <= starsi.e. 1 will get printed and five spaces will get printed and again 1 stars will get printed as we have declared 3 loops 1st for stars 2nd for spaces and 3rd again for stars then by if loop as i<= n /2 i.e. 3rd row so stars decrements and space increments by 2.
               For n = 4 declare 2 stars[incremented after 3rd loop] and declare spaces as 3[decremented in 3rd loop]. For 4th row i.e. i = 4 j = 1 to j <= starsi.e. 2 stars will get printed and three spaces will get printed and again 2 stars will get printed as we have declared 3 loops 1st for stars 2nd for spaces and 3rd again for stars then by if loop as i>= n /2 i.e. 4th row so stars incremented and space decremented by 2.
               For n = 5 declare 3 stars[incremented after 3rd loop] and declare spaces as 1[decremented in 4th loop]. For 5nd row i.e. i = 5 j = 1 to j <= starsi.e. 3 stars will get printed and 1 space will get printed and again 3 stars will get printed as we have declared 3 loops 1st for stars 2nd for spaces and 3rd again for stars. */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stars = n / 2 + 1;
        int space = 1;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= stars; j++)
            {
                System.out.print("*\t");
            }
            for(int j = 1; j <= space; j++)
            {
                System.out.print("\t");
            }
            for(int j = 1; j <= stars; j++)
            {
                System.out.print("*\t");
            }
            if(i <= n/2)
            {
               stars--;
               space = space + 2;
            }
            else
            {
               stars++;
               space = space - 2;
            }
            System.out.println();
        }

            

        // write ur code here

    }
}