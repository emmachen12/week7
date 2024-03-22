import java.util.*;
public class Grade {
    public static void main (String [] args)
    {
    int grad;
    

    Scanner input = new Scanner(System.in);
    System.out.print("Enter your grade: ");
    grad = input.nextInt();
    input.close();


    if(grad >= 90){
        System.out.println("You have an A");
    }
    else if(grad < 90 && grad >= 80){
        System.out.println("You have a B");
    }
    else if(grad < 80 && grad >= 70){
        System.out.println("You have a C");
    }
    else if(grad < 70 && grad >= 60){
        System.out.println("You have a D");
    }
    else if(grad < 60 ){
        System.out.println("You have a F ");
    }

    }
}