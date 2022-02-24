import java.util.*;
/* Problem: Print the following pattern
I/P: 5
O/P:
*	*	*	*	*	*	*	
	*				*	                            // The middle part in between is blank in this row so we gave the if loop in between
		*		*	                                    // The middle part in between is blank in this row so we gave the if loop in between
			*	
		*	*	*	
	*	*	*	*	*	
*	*	*	*	*	*	*	

Solution: To print this pattern we decalre i = 1 then we go to j loop where j = 1 and j <= spaces where spaces are 0 so no spaces are printed for first line. then we go to next j loop where j = 1 and j <= stars where stars are = n so we print 7 stars. For next line if i i.e. row is <= n / 2 i.e. upper half of the pattern then we increment spaces and decrement stars by 2 else vice - versa. 
Now for i = 2 i.e. next line or row we have j loop where j = 1 and j <= spaces where spaces are 1 now as we incremented earlier and we print 1 space and then in next j loop we see that j = 1 and j <= stars where stars are decremented by 2 so now we have 5 stars in the row but in if condition we have declared that if we want the middle half of the upper half to be blank then we declare the condition that the given condition part will be balnk and other part will be filled with stars. And as i <= n / 2 so spaces ++ and stars-=2 for next row. */ 
public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int stars = n;
    int spaces = 0;

    for(int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= spaces; j++)
        {
            System.out.print("\t");
        }
        for(int j = 1; j <= stars; j++)
        {
            if(i > 1 && i <= n / 2 && j > 1 && j < stars)
            {
                System.out.print("\t");
            }
            else{
                System.out.print("*\t");
            }
            
        }

        if(i <= n / 2)
        {
            spaces++;
            stars = stars - 2;
        }
        else
        {
            spaces--;
            stars = stars + 2;
        }
        System.out.println();
    } 


     // write ur code here

 }
}