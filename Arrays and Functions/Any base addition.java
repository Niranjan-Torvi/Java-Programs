// Any base addition problem
import java.util.*;
/* Problem : Any Base Addition: Add 2 nos with the base8
I/P: Base = 8 , n1 = 236, n2 = 754
O/P : 
Solution : 
10| 236 rem = 0 ,  754 rem = 0
10| 23  rem = 6,   75  rem = 4  Addition of rems = 10 so 10 % 8 = 2 as output[rem] and 1 as carry[quotient]  so 2 * 10 ^ 0 to put the rem at 1's place Note : We multiply rem with 10 ^ 0 because we want to place the output at 1's place instead of the first[1000s] place. Else the overall output would be 2121 instead of 1212
10| 2   rem = 3,   7   rem = 5  Addition of rems + 1 carry before = 9 so 9 % 8 = 1 as output[rem] and 1 as carry[quotient]    so 1 * 10 ^ 1 to put the rem at 10s place      Note : We multiply rem with 10 ^ 1 because we want to place the output at 10's place instead of the second[100s] place.
10| 0   rem = 2,   0   rem = 7  Addition of rems + 1 carry before = 10 so 10 % 8 = 2 as output[rem] and 1 as carry[quotient]  so 2 * 10 ^ 2 to put the rem at 100's place    Note : We multiply rem with 10 ^ 2 because we want to place the output at 100's place instead of the third[10s] place.
    0   rem = 0    0   rem = 0  Addition of rems + 1 carry before = 1 so 1 % 8 = 1 as output[rem] and 0 as carry[quotient]    so 1 * 10 ^ 3 to put the rem at 1000s place    Note : We multiply rem with 10 ^ 3 because we want to place the output at 1000's place instead of the first[1s] place.         
        
        OR

       (236)base8
     + (754)base8
     = (1212)base8   */  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int base = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(base, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int base, int n1, int n2){

       int res = 0;
       int carry = 0;
       int power = 1;
       while(n1 != 0 || n2 != 0 || carry > 0) // We perform the operation until n1 becomes 0 or n2 becomes 0 or carry is 1
       {
           int rem1 = n1 % 10;   // We take remainder from here
           int rem2 = n2 % 10;  
           n1 = n1 / 10;         // We take quotient from here
           n2 = n2 / 10;

           int output = rem1 + rem2 + carry; // Addition operation is performed with rem1  + rem2 + carry
           carry = output / base; // Considered as 8 here and output isthe addition of rem 
           output = output % base;// Considered as base 8 here


           res = res + output * power; //  The process we did here is as explained above 2 * 10 ^ 0 then 1 * 10 ^ 1then 2 * 10 ^ 2 then 1 * 10 ^ 3
           power = power * 10;   // We increment the power by 10 which was declared initially as 1;
       }

       return res;
       // write ur code here
   }
  }