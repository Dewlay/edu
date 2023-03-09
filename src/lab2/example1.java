package lab2;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import static java.lang.System.*;

public class example1 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        setOut(new PrintStream(out, true, "UTF-8"));

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число, чтобы проверить, делится ли оно на 3: ");

        int number = in.nextInt();
        if (number % 3 == 0) {
            System.out.println("Число делится на три");
        } else {
            System.out.println("Число не делится на три");
        }
    }
}
