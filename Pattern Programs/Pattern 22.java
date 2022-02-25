// Pattern 22

import java.io.*;
import java.util.*;
/* Problem : Print the following pattern:
I/P : 7
O/P: 
*	*	*	*	*	*	*	
	*	*	*	*	*	
		*	*	*	
			*	
		*		*	
	*				*	
*	*	*	*	*	*	*	
Solution: To print this pattern we will declare n = 7 stars for the first row and 0 spaces for the first row. Then for i = 1 the pointer will go in j loop for j = 1 and j <= spaces where spaces are 0 so no spaces are printed then j = 1 j <= stars the stars will get printed as in this (i > n / 2 + 1 && i < n  && j > 1 && j < stars) 1st condition does not meet as i <= n / 2. and then it will decrement stars by 2 and increment spaces by 1.
 for i = 2 the pointer will go in j loop for j = 1 and j <= spaces where spaces are 1 as incremented earlier so 1 spaces are printed then j = 1 j <= stars the stars will get printed as in this (i > n / 2 + 1 && i < n  && j > 1 && j < stars) 1st condition does not meet as i <= n / 2. and then it will decrement stars by 2 and increment spaces by 1.
 Then for i = 3 the pointer will go in j loop for j = 1 and j <= spaces where spaces are 2 so 2 spaces are printed then j = 1 j <= stars the stars will get printed as in this (i > n / 2 + 1 && i < n  && j > 1 && j < stars) 1st condition does not meet as i <= n / 2. and then it will decrement stars by 2 and increment spaces by 1.
 Then for i = 4 the pointer will go in j loop for j = 1 and j <= spaces where spaces are 3 so 3 spaces are printed then j = 1 j <= stars the stars will get printed as in this (i > n / 2 + 1 && i < n  && j > 1 && j < stars) 1st condition does not meet as i <= n / 2. and then it will increment stars by 2 and decrement spaces by 1 as now i >= n / 2.
 Then for i = 5 the pointer will go in j loop for j = 1 and j <= spaces where spaces are 2 so 2 spaces are printed then j = 1 j <= stars the stars will get printed with a space in between and will only print when it is 1st column and last column as in this (i > n / 2 + 1 && i < n  && j > 1 && j < stars) 1st condition meets now as i >= n / 2 and i < n i.e. i = 5 > 3 and then it will  increment stars by 2 and decrement spaces by 1.
 Then for i = 6 the pointer will go in j loop for j = 1 and j <= spaces where spaces are 1 so 1 spaces are printed then j = 1 j <= stars the stars will get printed with a space in between and will only print when it is 1st column and last column as in this (i > n / 2 + 1 && i < n  && j > 1 && j < stars) 1st condition meets now as i >= n / 2 and i < n i.e. i = 5 > 3 and then it will  increment stars by 2 and decrement spaces by 1.
 Then for i = 7 the pointer will go in j loop for j = 1 and j <= spaces where spaces are 0 so 0 spaces will be printed then j = 1 j <= stars where now stars = 7 which is n so all 7 stars are printed in last row and no if condition is met as before so no space is printed in between. In this way we printed this pattern. */
public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int space = 0;
    int stars = n;

    for(int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= space; j++)
        {
            System.out.print("\t");

        }
        for(int j = 1; j <= stars; j++)
        {
            if(i > n / 2 + 1 && i < n  && j > 1 && j < stars)
            {
                System.out.print("\t");
            }
            else{
                System.out.print("*\t");
            }
            
        }

        if(i <= n / 2)
        {
            space++;
            stars = stars - 2;
        }
        else
        {
            space--;
            stars = stars + 2;
        }

        System.out.println();
    }


    
    // write your code here
 }

}

