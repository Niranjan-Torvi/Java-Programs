// Sum of a Digit program

class Sumofdigits
{
    public static void main (String[] args) {
        /* code */
        int rem=0;
        int sum=0;
        int num=1234;
        while(num!=0)
        {
           rem=num%10;
           sum=sum+rem;
           num=num/10;
        }   
        System.out.println( sum);
    }
}

