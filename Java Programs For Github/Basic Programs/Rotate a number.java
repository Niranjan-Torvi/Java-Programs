import java.util.*;
   
   public class Main{
     // Problem Statement : To rotate a digit by given no of rotations
     // Solution: Ex - n = 273516 and k = 2  as k = 2 so div will be 100 as 2735 |16 so 16 will get rotated which means till 100's place. So 273516 / 100 so q = 2735 and r = 16. So now we need to get answer as 162735 so to get that we will add 10000 in 16 which will be 160000[multiplier] and then we will add 2735 + 160000 = 162735 as the rotated answer.   
   
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt(); // To accept the number
     int k = sc.nextInt(); // To accept the no of rotations


     int temp = n;
     int noOfDig = 0;
     while(temp > 0) // while loop to find no of digits in the given number
     {
       temp = temp / 10;
       noOfDig++;
     }

     k = k % noOfDig; // For larger no of rotations ex = 101 then 101 % 5 = 1 no of rotations.
     if(k < 0) // If no of rotations are given as -ve values 
     {
       k = k + noOfDig; // if k = -2 and noOfDig = 5 then no of rotations will be -2 + 5 = 3
     }
     int div = 1;
     int mult = 1;
     for(int i = 1; i <= noOfDig; i++)
     {
       if(i <= k)
       {
         div = div * 10; // This will run 2 times as i = 1 k = 2 so it will run until i becomes 2 so this will give output 100  
       }
       else
       {
         mult = mult * 10; // This will give output 1000 as after i becomes 3 it will multiply 1 * 10 at i = 4 , 10 * 10 = 100 and i = 5, 100 * 10 = 1000.
       }

     }
     int q = n / div;
     int r = n % div;

     int rotations = r * mult + q;
     System.out.println(rotations);
     
    }
   }