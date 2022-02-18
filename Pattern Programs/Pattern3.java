 // Pattern 3
import java.util.*;

/* Problem : Print the given pattern
   Solution : n = 5 and Expected op
                                *	
			*	*	
		*	*	*	
	*	*	*	*	
*	*	*	*	*	

So in the first for loop i = 1 it will go in next loop and print 4 spaces as initialized before and then in next loop it will print *** and then space-- and star++. Then it will come for next i loop and i = 2 so in next j loop it will print 3spaces and in next j loop it will print ** and space-- and star++. Now i = 3 and then 
i = 3 and now in next j loop space is 2 and next j loop stars are *** then space-- and star++. Now i = 4 and space = 1 and stars = 4 and in next i loop i = 5 and space = 0 and stars = 5 and in this way it will print the above pattern. */ 


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n - 1; // i.e. 4 stars initialized
        int stars = 1; // 1 star initialized
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= space; j++)
            {
                System.out.print("\t");
            }

            for(int j = 1; j <= stars; j++)
            {
                System.out.print("*\t");
            }

            space--;
            stars++;
            System.out.println();
        }



        

    }
}