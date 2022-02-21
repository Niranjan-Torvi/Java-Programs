// Pattern 5

import java.util.*;

public class Main {
    /* Problem : Print the following pattern

 I/P- 5
 O/P:           *	
	*	*	*	
 *	*	*	*	*	
	*	*	*	
		*	

  Solution : For input 5, space = n / 2 i.e. 2 for first ith row and stars will be 1 at initail row.
             Then for i = 1 we will print the above no of stars and spaces. Then as i <= n/2[1st row] space will get decremented and stars will be incremented by 2 
             Then for i = 2 we will print 1 + 2 i.e. 3 stars and  0 spaces. Then as i <= n/2[2nd row] space will get decremented and stars will be incremented by 2
             Then for i = 3 we will print 3 + 2 = 5 stars and 0 spaces. Then as i >= n/2[3rd row] space will get incremented and stars will be decremented by 2
             Then for i = 4 we will print 5 - 2 = 3 stars and 1 spaces. Then as i >= n/2[4th row] space will get incremented and stars will be decremented by 2
             Then for i = 5 we will print 3 -2 = 1 star and 2 spaces. Then as i >= n/2[5th row] space will get incremented and stars will be decremented by 2. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n / 2;
        int stars = 1;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= space; j++)
            {
                System.out.print("\t");
            }
            for(int j = 1; j <= stars; j++)
            {
                System.out.print("*\t");
            }

            if(i <= n / 2)
            {
                space--;
                stars = stars + 2;
            }
            else
            {
                space++;
                stars = stars - 2;
            }
            System.out.println();
        }

        

    }
}