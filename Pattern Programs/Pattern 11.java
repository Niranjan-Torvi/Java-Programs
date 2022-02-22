 // Pattern 11

import java.util.*;
/* Problem Statement : Print the following pattern:
I/P: 5
O/P:
1	
2	3	
4	5	6	
7	8	9	10	
11	12	13	14	15	

Solution : To print the pattern we have taken a value which is assigned 1 initially. Then in for loop i.e. ith loop 
which will run for 1st row when i = 1, then it will go to j loop where j = 1 and j <= i where i is 1 so it will print just 
1 in the first row. And value gets incremented. Then for i = 2 it will go in j loop and now j = 1 and j <=i where i is 2 
so it will print next two values after 1 i.e. 2 and 3 in the same row. Then value gets incremented now i = 3 and then in j loop 
j = 1 and j <= i where i = 3 so now it will print next values after 3 i.e. 4 5 6 in the same row and value++. Now for i = 4
in j loop j = 1 and j <= i where i = 4 so it print next values after 6 i.e. 7 8 9 10 in the same row and for i = 5 it will
print 11 12 13 14 15 in the same way. */ 

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int value = 1;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(value + "\t");
                value++;
            }
            System.out.println();
        }

       

    }
}