import java.util.*;

public class Main {
    /* Problem: Print the following pattern
       I/P: 5
       O/P:  
                1	           Now for i loop as i <= n/2 so space is already n / 2 and stars will gets incremented by 2 for next row and values will also get incremented like 1 2 3 4.Here j if loop will run and j <= n /2 but j = 1 j <= 1 so it will print 1 only.
	2	3	2	   Now for i loop as i <= n / 2 so space gets decremented by 2 as compared to before and stars get incremented by 2 and values also keep increasing like 2 & 3.Here j loop will run as j <= n/2 for 2 and also for next column so 2 will be incremented to 3 but again as last 2 is j !<n / 2 so value decrements to 2 again
3	4	5	4	3  Now for i loop as i = n / 2 so space gets decremented by 2 as compared to before and stars get incremented by 2 and values also keep increasing like 3,4,5.Here j loop will run as j <= n/2 for 3 so it gets increments to 4 and also j <= n/2 for next value so 4 increments to 5 but now for next column j !<= n / 2 so the value decrements to 4 and then to 3 
	2	3	2	   Now for i loop as i >= n / 2 so space gets incremented by 2 as compared to before and stars get decremented by 2 and values also keep decreasing like 2 3 from 3 4 5 4 3.Here in j loop 2 gets printed and the next is also j <= n/2 so increments to 3 but next is not j <= n/2 so it decrements to 2
		1	       Here only 1 gets printed.     
    Solution: In the first for loop in 1st row i.e. ith loop where i = 1 the loop will go in j loop where j = 1 and j <= space where space = n/2 i.e. 5/2 = 2 spaces will get printed.
    Now value is stored in columnvalue so for j loop j = 1 and j <= stars where stars are initialized as 1 so it will print 1 value. Now if j <= star / 2 i.e. if for ex - in the row if j <= columns / 2 then value will increase else it will decrease in a column.
    Now for rows i.e. i <= n/2 then space gets decremented in every row stars get incremented by 2 and value also increments and if i >= n/2 then space increments stars decrement by 2 and value also decrements. And then println statement will print next output in next line. The same process will be carried for i = 2, 3, 4, 5.
       */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = n / 2;
        int stars = 1;
        int value = 1;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= space; j++)
            {
                System.out.print("\t");
            }

            int colvalue = value;
            for(int j = 1; j <= stars; j++)
            {
                System.out.print(colvalue + "\t");

                if(j <= stars / 2) // First if loop This loop is for columns condition
                {
                    colvalue++;
                }
                else
                {
                    colvalue--;
                }
            }

            if(i <= n / 2) // 2nd if loop // This loop is for rows
            {
                space--;
                stars = stars + 2;
                value++;
            }
            else{
                space++;
                stars = stars - 2;
                value--;
            }
            System.out.println();
        }



        

    }
}