 // Pattern 12
import java.util.*;
/* Problem: Print the following pattern
I/P: 5
O/P:
0	
1	1	
2	3	5	
8	13	21	34	
55	89	144	233	377	

Solution : This is a pattern used to print fibonacci series.
In 1st for loop i = 1 i.e. for first row j = 1 and j <=i and print a"\t" so it will print a with a space on first line i.e. 0. So now c = a + b a =b and b = c where c = 1 and then a = b so a will be 1 and b will be 1.
So for i = 2 j = 1 to j <= i will print print two values of a and b where a = 1 and b = 1. Now c = 2 and it will print a + b = 2 now a = 1 and b = 2 so it will print 1 + 2  = 3 now a = 2 and b = 3 so 2 + 3 = 5 will be printed on same line.  
Now for i = 3 i.e. 3rd row j = 1 j <= i will print 3 values in first row. It will print 5 + 3 = 8 then a = 5 and b = 8 it will print 13 and now a = 8 and b = 13 so it will print a + b =21 so now a = 13 and b = 21 so a + b = 34 so it will print 34 on same line.  
Now for i = 4 i.e. 4th row j = 1 and j < =i i.e. i = 4 for 4 values in a row. So it will print a = 21 b = 34 so it will print 55 now a = 34 and b = 55 so now a + b = 89 then now a = 55 b = 89 so c= a + b = 144 now a = 89 and b = 144 so c = a + b = 233 and then a = 144 b = 233 so c = a + b = 377  will print on the same row. In this way loop continues till i = 5  */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(a + "\t");
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }

        // write ur code here

    }
}