import java.util.*;
public class NumberSum {
    public static void main (String [] args)
    {
    int num;
    int counter = 1;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    num = input.nextInt();
    input.close();
     do
     {
    System.out.println(counter);
    counter ++;

     } while (counter < num );

     System.out.println(num);

    }
}
