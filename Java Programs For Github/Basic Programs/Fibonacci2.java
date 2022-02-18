// Fibonacci program
class Fibonacci
{
    public static int  fib(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main (String[] args) {
        int n=8;
        System.out.println(fib(n));
    }
}


                            OR
import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=0;
      int b=1;
      for(int i=0;i<n;i++)
      {
          System.out.println(a);
          int c=a+b;
          a=b;
          b=c;
      }
   }
  }
