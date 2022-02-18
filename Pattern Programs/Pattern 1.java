import java.util.*;

public class Main {
    // Explanation : To print this pattern first it will go in i loop where i = 1 then it will go in j loop where it will check that j = 1 and j <= i where i = 1 so it will print * 1 time. Then it will come to i = 2. Then it will go to j loop and see that j = 1 and j <= i where i = 2 so it will print **. Now it will go to i where i = 3 now. And it will go to j loop and will see j = 1 and j <= i where i = 3 and then it will print ***. 
    // I/P - 4
    // O/P = *	
 //          *	 *	
 //          *	 *   *	
 //          *	 *   *	 *	


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }

        

    }
}