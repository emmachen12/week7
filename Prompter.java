import java.util.*;
public class Prompter {
    public static void main (String [] args)
    {
    int min;
    int max;
    int ans;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter minimum: ");
    min = input.nextInt();
    System.out.print("Enter maximum: ");
    max = input.nextInt();

    do 
    {
    System.out.print("Enter again: ");
    input.close();

    } while ( ans >= min && ans <= max);

    System.out.print("the number is: " + ans);

    }

}
