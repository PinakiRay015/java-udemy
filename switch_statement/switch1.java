package switch_statement;
import java.util.Scanner;
public class switch1 {
    public static void main(String[] args)
    {
        int choice;
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the two numbers ");
        int a = java.nextInt();
        int b = java.nextInt();
        int addition = a+b;
        int subtraction = a-b;
        int multiplication = a*b;
        int division = a/b;
        do {
            System.out.println("\n1->Addition");
            System.out.println("2->Subtraction");
            System.out.println("3->Multiplication");
            System.out.println("4->Division");
            System.out.println("5-> Exit");
            System.out.println("Enter your choice");
            choice = java.nextInt();
            switch(choice)
            {
                case 1->System.out.println("Addition of two numbers is "+addition);
                case 2->System.out.println("Subtraction of two numbers is "+subtraction);
                case 3->System.out.println("Multiplication of two numbers is "+multiplication);
                case 4->System.out.println("Division of two numbers is "+division);
                case 5->System.out.println("Exited!!");
                default->System.out.println("Invalid");
            }
        } while (choice!=5);
        java.close();
    }
}
