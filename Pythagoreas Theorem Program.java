

// Pythagorean Triplets Program ( Pythagoreas Theorem) 
// Problem : To check whether the triangle is pythagorean triangle or not i.e. a^2 + b^2 = c^2 For ex - 5^2 + 12^2 = 13^2 which is 169 == 169 so it is a pythagorean triplet

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int max=a;
    if(b>=max)
    {
        max=b;
    }
    if(c>=max)
    {
        max=c;
    }
    
    if(max==a)
    {
        boolean flag=((b*b + c*c) == (a*a));
        
        System.out.println(flag);
    }    
        
    else if(max==b) 
    {
        boolean flag=((a*a + c*c) == (b*b));
        
        System.out.println(flag);
        
    }
    else  
    {
        boolean flag=((a*a + b*b) == (c*c));
        
        System.out.println(flag);
    }    
        
   }
  }
