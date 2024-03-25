//Emma
import java.util.*;
public class DigitSum {
    public static void main (String [] args)
    {
    int num = 0;
    int sum = 0;
    int digit = 0;
   
   
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    num = input.nextInt();


    do
    {
        digit = num % 10;
        sum = sum + digit;
        num /= 10;
    } while (num > 0);
       
        System.out.print("The sum of the digits is:  " + sum);


    }
}


