// Pattern 16

import java.util.*;

public class Main{
    /* Problem : Print the following pattern:
    I/P: 4
    O/P: 
1						1	
1	2				2	1	
1	2	3		3	2	1	
1	2	3	4	3	2	1	
	
                                      
Solution: First declare value = 1 then declare spaces as 2 * n - 3. where 2 * 4 - 3 = 5 spaces. For i = 1 we go in j loop where we declare jvalue as 1 initially and then j = 1 and j <= value where value = 1 so it will print 1 star then in next j loop j = 1 j <= space where space = 2 * 4 - 3  = 5 spaces Then another j loop for printing the same values as we gave in the beginning j loop. The upper if loop is given for the last row where i == n then print 1 less value as last row prints 1 extra value and also decrease jvalue as when we print the 2nd part of columns it takes the same value as that of middle value. Then we increment the value and we decrement the space by 2 for the next row. 
Then i = 2 and then all three j loops and then if loop condition follow the same rules and steps. */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int value = 1;
    int space = 2 * n - 3;
    for(int i = 1; i <= n; i++)
    {
        int jvalue = 1;
        for(int j = 1; j <= value; j++) // Code for 1st half elements of a single row.
        {
            System.out.print(jvalue + "\t");
            jvalue++;
        }
        for(int j = 1; j <= space; j++) // Code for middle part where spaces are printed
        {
            System.out.print("\t");
        }

        if(i == n) // For the last row which is a exception case
        {
            value--;
            jvalue--; // This will print 3 2 1 instead of 4 3 2
        }

        for(int j = 1; j <= value; j++) // Code for 2nd half where values are printed in a single row
        {
            jvalue--; // We do this because for ex in 3rd row in second half we are supposed to print 3 2 1 but 4 3 2 gets printed so before we print we will decrement the value so that 2nd half starts from 3 and prints 3 2 1
            System.out.print(jvalue + "\t");
        }

        value++;
        space -= 2;
        System.out.println();
    }


     // write ur code here

 }
}