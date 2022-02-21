import java.util.*;
/* Problem: Print the following pattern
I/P: 5
O/P:
*	
	*	
		*	
			*	
				*	
Solution : First for loop will take i = 1 i.e. first row and then j = 1 and then j <= n i.e. 5 so 1st row can print 5 * in the same way i = 2 and j = 1 & j <= n will again print 5 *s and then same for i = 3 i = 4 and i = 5 but we have given a condition that if i == j[i.e. (i,j) == (1,1),(2,2),(3,3),(4,4), or (5,5)] then only it will print stars else it will print spaces. In this way this pattern gets printed. */


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(i == j)
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