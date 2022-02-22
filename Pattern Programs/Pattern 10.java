 // Pattern 10

import java.util.*;
/* Problem : Print the following pattern:
I/P: 5
O/P:
		*	
	*		*	
*				*	
	*		*	
		*	
Solution: To print the pattern for n = 5 first declare outerspace as n/2 i.e. 5/2 = 2 for first row i.e. i = 1 and declare innerspace as -1 (which is equal to 0 but to get difference of 2 we declare it as -1). So in first for loop for i = 1 i.e. row 1 we go in j loop i.e. j = 1 to j <= outerspace so it will print n/2 = 2 outerspaces and a star and then innerspace which is -1. According to the if statement as i !> 1 we will not print a star again and now in next if loop as i <= n / 2 so outerspace-- and innerspace+=2 for next row.
Now for next row i.e. i = 2 the loop will go in j loop and as we had decremented outerspace so it will print 1 outerspace and then a star and then as we incremented innerspace by 2 we will print 1 space and then as in if loop i > 1 so we will print another star. And then in next if loop as i<= n/2 we will decrement outerspace and increment innerspace by 2.
Then for i = 3  in j loop we will print 0 outerspaces as we decremented it then we will print a star and then innerspace was increased by 2 so it will print 3 innerspaces and as i > 1 so if loop will run and will print a star at last. Then as i >= n/2 so now outerspace++ and innerspace-=2.
For i = 4 it will go in j loop it will print 1 outerspace as we incremented  then a star then we decremented innerspace by 2 so 1 innerspace and then as i > 1 and i < n so it will print star at last. Then as i >= n/2 so outerspace++ and innerspace-=2.
For i = 5 it will go in j loop it will print 2 outerspaces as we incremented then a star and then innerspace will be decremented by 2 so innerspace will be -1 so not printed and then as i !< n but i == n so a star will not be printed at last. And as i == 6 after this loop so for loop will break and the pattern will get printed. */   

public class Main{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int outerspace = n/2;
    int innerspace = -1;
    for(int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= outerspace; j++)
        {
            System.out.print("\t");
        }
        System.out.print("*\t");

        for(int j = 1; j <= innerspace; j++)
        {
            System.out.print("\t");
        }

        if(i > 1 && i < n)
        {
            System.out.print("*\t");
        }
        if(i <= n / 2)
        {
            outerspace--;
            innerspace = innerspace + 2;
        }
        else
        {
            outerspace++;
            innerspace = innerspace - 2;
            
        }
        System.out.println();
    }

     // write ur code here

 }
}