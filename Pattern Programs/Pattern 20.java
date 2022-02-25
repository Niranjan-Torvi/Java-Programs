// Pattern 20
import java.util.*;
/* Problem : Print the following pattern:
I/P: 5
O/P: 
*				*	
*				*	
*		*		*	
*	*		*	*	
*				*	
Solution : For first row i.e. when i = 1 then we go to j = 1 to j<=n where n = 5 so in if loop it is 1st and last column in the first row then only print the star else print spaces.
2nd if statement states that if i > n / 2 i.e. 7 / 2 + 1 =  > than 4th row and if it is diagonal(i == j || i + j == n + 1) Diagonal formula then only print the stars else print spaces and then println for the control will go to next line i.e. row i.e. i = 2 ,3 ,4, 5, 6, 7 according to the if loop. */
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(j == 1 || j == n)
                {
                    System.out.print("*\t");
                }
                else if(i > n / 2 && (i == j || i + j == n + 1))
                {
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }

                
            }
            System.out.println();
        }



        // write ur code here

    }
}