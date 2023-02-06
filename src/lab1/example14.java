package lab1;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import static java.lang.System.*;

public class example14 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        setOut(new PrintStream(out, true, "UTF-8"));

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();

        int number1 = number - 1;
        int number2 = number;
        int number3 = number + 1;
        double number4 = Math.pow(number1 + number2 + number3, 2);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        in.close();
    }
}