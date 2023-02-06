package lab1;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import static java.lang.System.*;

public class example9 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        setOut(new PrintStream(out, true, "UTF-8"));

        Scanner in = new Scanner(System.in);

        System.out.print("Введите месяц: ");
        String month = in.nextLine();
        System.out.print("Введите количество дней: ");
        int days = in.nextInt();
        System.out.printf("%s состоит из %d дней!", month, days);
        in.close();
    }
}
