import java.util.*;

public class Main{
// Problem Statement : To Find Inverse of a number
  // Ex- digit    2 1 4 5 3
  //     position 5 4 3 2 1
  // Expected output 
  // digit    2 3 1 5 4
  // position 5 4 3 2 1

  // i.e. As 3 is on 1st position so in output 1 will be on 3rd position. In the same way 5 is on 2nd position so output will be 2 will be on 5th position. So while loop will run until n becomes 0. The formula for 1st digit output is 4 digit on 4th position so 4 * 10 ^ 1-1. 2nd digit = 2nd pos dig = 5. So 5 * 10 ^ 2 - 1. 
public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int inverse = 0;
  int originalpos = 1;
  while(n != 0)
  {
    int originaldig = n % 10; // Last digit of originaldig at first position as defined above
    int inverteddig = originalpos; // Replacing inverteddig with originalpos 
    int invertedpos = originaldig; // Replacing invertedpos with originaldig

    // Making changes to inverse using invertedpos and inverteddig
    inverse = inverse + inverteddig * (int)Math.pow(10, invertedpos - 1); // inverteddig * 10 ^ invertedpos - 1. This is done to place the inverted no at the inverted position i.e. 10th place 100th place 1000th place etc 
    n = n / 10; // To make no smaller
    originalpos++; // To increase position to move to next no
  }
  System.out.println(inverse);
    
 }
}