import java.util.*;
/* Problem : To count the digit frequency or no of times a number have occured in a digit.
For Ex- no = 892347522 and key = 2 so the output will be 3 as 2 have ocurred 3 times in the given number'892347522'.
Solution : We declare no, key and store the output by the function getdigitfrequency in the variable f.
Then in the function getdigitfrequency we decalre count as 0.
Then till the no becomes 0(while loop) find the remainder and divide the no[892347522] by 10 and if the rem we got matches the key[2] we increment the counter. In this way we get our output 3. */
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int key = scn.nextInt();
        int f = getDigitFrequency(n, key);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int key) {
        int count = 0;
        while(n != 0)
        {
            int rem = n % 10;
            n = n / 10;


            if(rem == key)
            {
                count++;
            }
        }

        return count;

        

        // write code here
    }
}