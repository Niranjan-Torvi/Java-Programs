// Pattern 8
import java.util.*;
/* Problem : Print the following pattern
I/P: 5
O/P: 
			       *	
			*		
		*			
	*				
*	
Solution : For n = 5, In the first for loop we have i = 1 i.e. for the first row then it will go to j = 1 & j <= n it will print 5 * and then for i = 2 it will go in j loop and print 5* again in this way it will print a box of 5 x 5 with stars so we will put a condition that if i + j = n + 1 then only we will print stars i.e. for(i,j) where n = 5, if for(1,2),(1 + 2 != 6) so it will not print stars but spaces and if(4,2) i.e. (4+2==6) so it will print stars at that coordinate. */ 				

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(i + j == n + 1)
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