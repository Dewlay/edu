package lab1;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import static java.lang.System.*;

public class example13 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        setOut(new PrintStream(out, true, "UTF-8"));
		Scanner in = new Scanner(System.in);
		
        System.out.print("Число 1: ");
        int с1 = in.nextInt();
	
        System.out.print("Число 2: ");
        int с2 = in.nextInt();
        
        int sum = с1 + с2;
        System.out.println("Сумма: " +  sum);
	}
}
