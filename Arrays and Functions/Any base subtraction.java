 // Any base subtraction

import java.util.*;
/*Problem : Any base subtraction: Subtraction of 2nos with base 8
I/P : base = 8 , n2 = 1212, n1 = 256 so

10| 1212                                            256
10| 121 - rem = 2 + 8 = 10,                         25 - rem = 6, rem2 - rem1 = borrow = -1 and output = 4 * 10 ^ 0 //This is used to place the output to its 1s place instead of 1000s place else the output would be 4370 instead of 734  
10| 12 -  rem = 1 cuts to 0 and 0 + 8 = 8           2  - rem = 5 , rem 2 - rem1 = borrow = -1 and output = 3 * 10 ^ 1 //This is used to place the output to its 10s place instead of 100s place
10| 1  -  rem = 3 cuts to 1 and adds 8 = 9          0  - rem = 3 , rem2 - rem1 = borrow = -1 and output = 7 * 10 ^ 2 // This is used to place the output to its 100s place instead of 10s place
    0  -  rem = 1 cuts to 0                         0  - rem = 0  , rem2 - rem1 = borrow = 0 and output = 0 * 10 ^ 3 // This is used to place the output to its 1000s place instead of 1s place
  

  1 2 1 2 base8
-   2 5 6 base8
= 0 7 3 4 base8    */
 
 public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int base = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(base, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int base, int n1, int n2){
       int res = 0;
       int power = 1;
       int borrow = 0;

       while(n2 != 0)
       {
           int rem1 = n1 % 10;
           n1 = n1 / 10;

           int rem2 = n2 % 10;
           n2 = n2 / 10;


           int output = 0;
           rem2 = rem2 + borrow;

           if(rem2 >= rem1)
           {
               borrow = 0;
               output = rem2 - rem1;
           }
           else
           {
               borrow = -1;
               output = rem2 + base - rem1; // Here base is 8
           }

           res = res + output * power; // in the ex - 4 * 10 ^ 1 , 3 * 10 ^ 2 , 7 * 10 ^ 3
           power = power * 10; // Power gets incremented by 10 for next remainder so that the rem gets placed from 1s to 10s place or 10s to 100s place or 100s place to 1000s place.

       }
       return res;
       // write your code here
   }
  
  }