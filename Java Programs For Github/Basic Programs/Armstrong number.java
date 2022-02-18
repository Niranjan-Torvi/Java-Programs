// Armstrong number

Armstrong number program
public class Armstrong
{
    public static void main(String args[])
    {
      int n=153;
      int rem=0;
      int res=0;
      int temp=n;
      while(n!=0)
      {
        rem=n%10;
        res+=Math.pow(rem,3);
        n=n/10;
      }
      if(res==temp)
      {
        System.out.println("The no is armstrong");
      }
      else
      {
        System.out.println("The no is not armstrong");
      }
    }  
}
