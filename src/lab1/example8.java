package lab1;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import static java.lang.System.*;

public class example8 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        setOut(new PrintStream(out, true, "UTF-8"));
        Scanner in = new Scanner(System.in);

        System.out.println("Какой сегодня день недели? ");
        String weekday = in.nextLine();

        System.out.println("Какой сейчас месяц? ");
        String month = in.nextLine();

        System.out.println("Какой сегодня день месяца? ");
        int day = in.nextInt();
        
        System.out.println("Сегодня: " + weekday + " " + day + " " + month);
      
        in.close();

    }
}
