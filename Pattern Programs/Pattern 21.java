// Pattern 21
import java.util.*;
/* Problem: Print the following pattern:
I/P : 5
O/P:
*				*	           
*	*		*	*	                         // *                 *   This is diagonal part in the pattern
*		*		*	                                *        * 
*				*	                                    *
*				*	
Solution : for i = 1 and i <= n and j = 1 and j <= n we create n no of rows and columns but we print the stars only if the "if"  and "if else" conditions meet else we print all others as spaces. Note : Diagonal Formula is given in the if else loop i.e. (i == j || i + j == n + 1). This the same way we print the "W" pattern the only difference is in if else loop i.e. i >= n / 2 will print W as 7 / 2 or 5 / 2 = 3  or 2  so rows > 3 or rows > 2 will only get printed in a diagonal way for n = 7 and n = 5 respectively. But in "M" case we gave i <= n / 2 i.e. 5 / 2 where n = 5 so we got 2 so rows <= 2 should be printed in a diagonal way in the form of stars. */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(j == 1 || j == n)
                {
                    System.out.print("*\t");
                }
                else if(i <= n / 2 + 1 && (i == j || i + j == n + 1 ))
                {
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        
    
        
    }
}