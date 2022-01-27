package input;
import java.util.Scanner;
public class input {
    
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = java.nextLine();
        System.out.println("Enter the number");
        int a = java.nextInt();
        System.out.println("This is your name "+name);
        System.out.println("This is your entered number "+a);
        java.close();
    }
}