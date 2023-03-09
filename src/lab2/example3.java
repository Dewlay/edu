package lab2;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import static java.lang.System.*;
import java.util.Scanner;

public class example3 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        setOut(new PrintStream(out, true, "UTF-8"));

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        if (number % 4 == 0 && number >= 10) {
            System.out.println("Число соответствует требованиям");
        } else {
            System.out.println("Число не соответствует требованиям");
        }
    }
}
