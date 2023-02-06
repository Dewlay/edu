package lab1;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import static java.lang.System.*;

public class example15 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        setOut(new PrintStream(out, true, "UTF-8"));

        int number1, number2, sum, difference;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        number1 = in.nextInt();
        System.out.print("Введите число 2: ");
        number2 = in.nextInt();
        sum = number1 + number2;
        difference = number1 - number2;
        System.out.printf("Сумма = %d Разность = %d", sum, difference);
	in.close();
    }
}