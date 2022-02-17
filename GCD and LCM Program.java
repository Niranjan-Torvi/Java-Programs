 // GCD and LCM Program
import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int rem = 0;
        int original1 = num1;
        int original2 = num2;
        
            // GCD Code in while loop
        while(num1 % num2!= 0) // Example for gcd = 36 % 24 = 12 now  24 is n1 and 12 is n2 so 24 % 12 = 0   
        {                                           n1 % n2   rem
            rem = num1 % num2;
            num1 = num2;
            num2 = rem;
            
        }
        int gcd = num2;
        int lcm= (original1 * original2) / gcd; // Formula for LCM Calculation
        System.out.println(gcd);
        System.out.println(lcm);
        
     }
    }
