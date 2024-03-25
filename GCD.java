//Emma
import java.util.*;
public class GCD {
    public static void main (String [] args)
    {
    int num1;
    int num2;
    int gcd;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter number: ");
    num1 = input.nextInt();
    System.out.print("Enter number: ");
    num2 = input.nextInt();
    input.close();
    
    do
    {
    gcd = num1 % num2;
    num1 = num2;
    num2 = gcd;
    } while (num2 > 0);

    System.out.println("The GCD is: " + num1);

    }
}