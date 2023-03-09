package lab2;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import static java.lang.System.*;

public class example2 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        setOut(new PrintStream(out, true, "UTF-8"));

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");

        int number = in.nextInt();
        if (number % 5 == 2 || number % 7 == 1) {
            System.out.println("Число соответствует требованиям");
        } else {
            System.out.println("Число не соответствует требованиям");
        }
    }
}