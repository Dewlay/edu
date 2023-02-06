package lab1;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import static java.lang.System.*;

public class example12 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        setOut(new PrintStream(out, true, "UTF-8"));

        Scanner in = new Scanner(System.in);
        int year = 2023;
        System.out.print("Введите ваш возраст: ");
        int yo = in.nextInt();
        int byear = year - yo;
        System.out.println("Ваш год рождения: " + byear);
        in.close();
    }
}