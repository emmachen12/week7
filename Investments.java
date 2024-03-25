//Emma
import java.util.*;
public class Investments {
    public static void main (String [] args)
    {
    int years = 0;
    double start = 2500.0;
    double end = 5000.0 ;
   
    do
    {
    start += start*.075;
    years++;
   
    } while (start < end);
   
    System.out.print("It will take " + years + " to get to " + end + " dollars.");




    }
}

