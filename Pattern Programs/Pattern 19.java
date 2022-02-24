// Pattern 19 Swastik pattern
import java.util.*;
/* Problem: Print the following pattern:

I/P : 7
O/P :
*	*	*	*			*	 Row 1
			*			*	 Row 2
			*			*	 Row 3
*	*	*	*	*	*	*	 Row 4
*			*				 Row 5
*			*				 Row 6
*			*	*	*	*	 Row 7

Solution : To print the following pattern for input 7 we take i = 1 and then go to j loop and see which condition is true
if it is 1st row then it will print the condition 1 if it is 2nd and 3rd row then it will print condition 2 if it is 4th row then it will print condition 3 
if it is 5th or 6th row and it will print condition 4 and if it is 7th row then it will print condition 5. */
                               

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    for(int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= n; j++)
        {
            if(i == 1) // Condition 1 // This condition runs if row is 1
            {
                if(j == n || j <= n / 2 + 1) // This loop runs if the columns in first row are <=n/2 or the last column in first row
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            
            }
            else if(i <= n / 2) // Condition 2 This loop runs if it is row 2 or row 3
            {
                if(j == n || j == n / 2 + 1) // This loop runs if it is last column in second and third row  or the column is n / 2 + 1 i.e. 3 + 1 = 4th column in 2nd row and 3rd row.
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }   

            else if(i == n / 2 + 1) // Condition 3 This loop runs if the row is n / 2 + 1 i.e. 7/2+1 = 4th row
            {
                
        
                System.out.print("*\t");
            }

            else if(i < n) // Condition 4 This loop runs when the row i.e. i > n / 2 + 1 and i< n i.e.  for 5th and 6th row 
            {
                if(j == 1 || j == n / 2 + 1) // This loop runs when it is 1st column and (n/2+1 = 7/2+1) = 4th column of 5th and 6th row 
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }    

            else // Condition 5 // This loop runs for last row
            {
                if(j == 1 || j >= n / 2 + 1) // This loop runs for first column and 7/2+1 = 4th column in the last row.
                {
                      System.out.print("*\t");
                }
                else
                {
                      System.out.print("\t");
                }
                
            }   
            
        }

        System.out.println();
    }

    // write ur code here
}
}

