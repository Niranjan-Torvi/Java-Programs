import java.util.*;
  /* Problem : Convert decimal no to octal number
  I/P: (634)base 10 
  O/P : (1172)base 8

  8|634
  8|79  rem 2          = 2 * 10 ^ 0 because we want to place 2 at 1's place
  8|9   rem 7          = 7 * 10 ^ 1 because we want to place 7 at 10's place
  8|1   rem 1          = 1 * 10 ^ 2 because we want to place 1 at 100's place
    0   rem 1          = 1 * 10 ^ 3 because we want to place 1 at 1000's place    This is the way we get (1172)base8 as we multiply the remainders ith the powers at which positions we want the remainders to place i.e. opposite of the sequence of the remainders occurred. i.e.convert remainder 2711 to 1172
  Solution : We declare count as 0 and power(10power2 = 100) as 1 initially. Then we take remainder of the no by dividing it by 8 and then dividing the no by 8 to get the smaller version of the no. We keep dividing until n becomes 0. Then in count variable we do rem * power where power is 1 to place the first remainder at the last position i.e. ones place and then we increase the power by 10 for the next remainder.
  Then for the next division we follow the same division process and then in the count variable we multiply latest remainder by 1 * 10 = 10 power and then we increment power by p * 10 for the next remainder and the present remainder will be placed at 10s place and the next remainder will be placed at 100s, next one at 1000s and so on. */

  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int base = scn.nextInt();
      int dn = getValueInBase(n, base);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int base){
       // write code here
       int count = 0;
       int power = 1;
       while(n != 0)
       {
           int rem = n % base;
           n = n / base;

           count = count + rem * power;  // imp
           power = power * 10; // This process to increase the powers from 10 to 100 to 1000 for next remainders to be placed at the positions of 10s 100s and 1000s
       }
       return count;
   }
  }

