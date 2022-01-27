package switch_statement;
import java.util.Scanner;
public class switch1 {
    public static void main(String[] args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = java.nextInt();
        int b = java.nextInt();
        int addition = a+b;
        int subtraction = a-b;
        int multiplication = a*b;
        int division = a/b;
        System.out.println("1->Addition");
        System.out.println("2->Subtraction");
        System.out.println("3->Multiplication");
        System.out.println("4->Division");
        System.out.println("\nEnter your choice");
        int choice = java.nextInt();
        switch(choice)
        {
            case 1->System.out.println("Addition of two numbers is "+addition);
            case 2->System.out.println("Subtraction of two numbers is "+subtraction);
            case 3->System.out.println("Mutiplication of two numbers is "+multiplication);
            case 4->System.out.println("Division of two numbers is "+division);
            default->System.out.println("Invalid choice");
        }
        java.close();
    }
}
