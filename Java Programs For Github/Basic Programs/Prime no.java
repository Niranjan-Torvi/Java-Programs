// Prime no
class Prime
{
    public static void main (String[] args) {
        /* code */
         int no=23;
         int count=0;
         for(int i=2;i<=no-1;i++)
         {
             if(no%i==0)
             {
                 count++;
             }
         }
         if(count>0)
         {
             System.out.println("The no is not prime no");
         }
         System.out.println("The no is a prime");
    }
    
}

                                              OR

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int t=scn.nextInt();
      for(int j=0;j<t;j++)
      {
          int n=scn.nextInt();
          int count=0;
          for(int i=2;i*i<=n;i++)
          {
              if(n%i==0)
              {
                  count++;
                  break;
              }
          }
          if(count==0)
          {
              System.out.println("The no is prime");
          }
          else
          {
              System.out.println("The no is not prime");
          }
      }
      
      
  
       // write ur code here
  
   }
  }

