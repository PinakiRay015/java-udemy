package input;
import java.util.Scanner;
public class input {
    
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        System.out.print("Enter the number you want to print ");
        int a = java.nextInt();
        System.out.println("The number you entered is "+a);
        java.close();
    }
}
