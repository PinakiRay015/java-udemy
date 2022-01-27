package for_loop;
import java.util.Scanner;
public class for_loop {
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = java.nextInt();
        for(int i=0;i<=a;++i)
        {
            System.out.println("This is the number "+i);
        }
        java.close();
    }
}
