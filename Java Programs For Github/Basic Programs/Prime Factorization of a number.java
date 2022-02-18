// Prime Factorization of a number
import java.util.*;

public class Main{
  // Problem: To find prime factors of a number.
  // Solution : Ex - 90 = n so 90 / 2[for loop starts with 2 so take 2 as divisor] = 45, As now 45 !/ 2 so by increasing for loop div = 3 so 45 / 3 = 15 then 15 / 3 = 5 now 5 !/3 so for loop increments to 4, 5 !/ 4 so now for loop ++ and 5 / 5 = 1 so now it will print the output. While loop will run until no % divisor == 0 as soon as no is not divisible by divisor we will increment for loop so that the no gets divided. Expected I/P - 1440 Expected O/P = 2 2 2 2 2 3 3 5 [prime factors of 1440]

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();

  for(int div = 2; div * div <=n; div++)
  {
    while(n % div == 0)
    {
      n = n / div;
      System.out.print(div + " ");
    }
  }

  if(n != 1) // If the n does not come till 1 for ex - 46 / 2 = 23 now 23 / 2 not possible as 23 is prime factor itself so we will directly print 23.
  {
    System.out.print(n);
  }
   
 }
}