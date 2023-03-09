package lab2;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import static java.lang.System.*;
import java.util.Scanner;

public class example5 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        setOut(new PrintStream(out, true, "UTF-8"));

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int number2 = (number / 1000) % 10;
        if (number2 == 1) {
            System.out.println(number2 + " тысяча");
        } else if (number2 > 5 && number2 < 9) {
            System.out.println(number2 + " тысяч");
        } else {
            System.out.println(number2 + " тысячи");
        }
    }
}
