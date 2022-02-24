 // Pattern 17

import java.util.*;
/* Problem : Print the following pattern:
I/P: 5
O/P: 
	        *
		*	*	
*	*	*	*	*	
		*	*	
		*	

Solution : To declare the following pattern we initialize space = n / 2 for the first row and star for the first row.
Then in i loop for i = 1 we go in j loop and then j = 1 and then j <= space where spaces are n / 2 so 2 spaces get printed. Then We print 1 * using the next j loop and as we are increasing the stars in the first half and after first half we are decreasing the stars so we decare the if loop so that if i <= n / 2 then stars increase if not then stars decrease. There is a special case in the first j loop that if the row is middle row then we will print all the stars in that row and no spaces. Then we give println statement to go to next line and follow the same process. */
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stars = 1;
        int space = n / 2;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= space; j++)
            {
                if(i == n / 2 + 1)
                {
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            for(int j = 1; j <= stars; j++)
            {
                System.out.print("*\t");
            }

            if(i <= n / 2)
            {
                stars++;
            }
            else
            {
                stars--;
            }
            System.out.println();
        }

        // write ur code here

    }
}