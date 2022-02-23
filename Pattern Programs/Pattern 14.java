// Pattern 14

import java.util.*;
/* Problem: Print the following pattern
Solution : Print table of three in the following form
I/P : 3
O/P : 
3 * 1 = 3
3 * 2 = 6
3 * 3 = 9
3 * 4 = 12
3 * 5 = 15
3 * 6 = 18
3 * 7 = 21
3 * 8 = 24
3 * 9 = 27
3 * 10 = 30
*/
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int res = 0;
        for(int i = 1; i <= 10; i++)
        {
            res = x * i;
            System.out.println(x + " * " + i + " = " + res);
        }
        

        

    }
}