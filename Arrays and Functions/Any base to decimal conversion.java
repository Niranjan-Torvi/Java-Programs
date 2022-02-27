// Any base to decimal

import java.util.*;
/* Problem : Convert octal or any base to decimal.
I/P : (1172)base8 convert it into (634)base10
So, start taking modulus and dividing 1172 / 10 as we are converting the number to decimal
10|1172
10|117  rem = 2 so 2 * 8 ^ 0   // This is rem * power This will be placed at 1's place
10|11   rem = 7 so 7 * 8 ^ 1   // This will be placed at 10's place as we did power = power * 10 after the first remainder
10|1    rem = 1 so 1 * 8 ^ 2   // This will be placed at 100's place   - || -
   0    rem = 1 so 1 * 8 ^ 3   // This will be placed at 1000's place  - || -      

Solution : Initially we declare n which is 1172 then base 8. Then we come to taking modulus and dividing the no by 10 until the no becomes 0. So we declare the res = rem * power  where initially the power is declared as 1 so the 1st remainder will be * by 1 so that the remainder gets placed at 1's place and then we increment the power by * by 10 so that the next remainder will be placed at 10's place and then we increment the power by 10 so next remainder will be placed at 100 and then 1000s till the end of the remainders[rem]. */
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int base = scn.nextInt();
      int d = getValueIndecimal(n, base);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int base){
      int res = 0;
      int power = 1; 
      while(n != 0)
      {
         int rem = n % 10;
         n = n / 10;
         res = res + rem * power;
         power = power * base;
      }

      return res;
      // write your code here
   }
  }