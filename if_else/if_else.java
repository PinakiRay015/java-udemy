// Java Program To check the larger number between two
package if_else;
import java.util.Scanner;
public class if_else{
    public static void main(String[] args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the value of two numbers");
        int a = java.nextInt();
        int b = java.nextInt();
        if(a>b)
        {
            System.out.printf("%d is greater than %d" , a , b);
        }
        else
        {
            System.out.printf("%d is greater than %d" , b , a);
        }
        java.close();
    }
}