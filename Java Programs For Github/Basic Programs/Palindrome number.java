 // Palindrome number

class Palindrome{
    public static void main (String[] args) {
        int n=123;
        int rem=0;
        int s=0;
        while(n>0)
        {
            rem=n%10;
            n=n/10;
            s=s*10+rem;
        }
        if(n==s)
        {
            System.out.println("It is palindrome");
        }
        else
        {
            System.out.println("It is not palindrome");
        }
    }
}

