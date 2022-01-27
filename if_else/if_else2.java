package if_else;
import java.io.*;
public class if_else2 {
    public static void main(String[] args)throws Exception
    {
        BufferedReader java = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the three numbers ");
        int a = Integer.parseInt(java.readLine());
        int b = Integer.parseInt(java.readLine());
        int c = Integer.parseInt(java.readLine());

        if(a>b)
        {
            if(a>c)
            {
                System.out.printf("%d is greater than %d and %d" , a , b , c);
            }
            else
            {
                System.out.printf("%d is greater than %d and %d" , c , b , a);
            }
        }
        else
        {
            if(b>c)
            {
                System.out.printf("%d is greater than %d and %d" , b , a , c);
            }
            else
            {
                System.out.printf("%d is greater than %d and %d" , c , b , a);
            }
        }
    }

}