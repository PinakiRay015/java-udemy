package do_while;

import java.io.*;

public class do_while {
    public static void main(String[] args) throws Exception {
        BufferedReader java = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        int a = Integer.parseInt(java.readLine());
        do {
            System.out.println("The number is " +a);
            a = a+1;
        } while (a<=10);
    }
}