// Pattern 13

import java.util.*;
public class Main{
    /* Problem : Print the following pattern
    I/P : 5
    O/P : 
i0| 1	
i1| 1	1	
i2| 1   2	1	
i3| 1   3	3	1	
i4| 1	4	6	4	1	
    
    j0  j1     j2      j3      j4

    Solution : 4C0 i.e. icj i.e. i4Cj0 = 1 then 4C1 i.e. i4Cj1 = 4 in this way we print the permutations and combinations value. Note: Here we took both loops from i = 0 and j = 0 because we wanted to calculate 0th permutation also like 5C0 so to take 0th value for formula we started loop from 0 */
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
    
        for(int i = 0; i < n; i++)
        {
            int icj = 1; //icj = iCj it is the permutation formula ncn i.e. nc0, nc1, nc2 
            for(int j = 0; j <= i; j++)
            {
                System.out.print(icj + "\t");
                int icjp1 = icj * (i-j) / (j + 1); // This is the formula for printing the next values in a row using 1st value in the row when we have 1st value in the row always as 1 in this case where p1 here means permutation1
                icj = icjp1;
            }
            System.out.println();
        }

        //write your code here

    }
}