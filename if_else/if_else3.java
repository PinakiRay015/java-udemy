package if_else;
import java.util.Scanner;
public class if_else3
{
    public static void main(String[] args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = java.nextLine();
        name = name.toLowerCase();
        if(name.startsWith("roh")|(name.startsWith("pina")))
        {
            System.out.println("Hello "+name+",nice to meet you sir");
        }
        else
        {
            System.out.println("Hello "+name);
        }
        java.close();
    }
}