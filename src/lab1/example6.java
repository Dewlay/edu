package lab1;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import static java.lang.System.*;

public class example6 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        setOut(new PrintStream(out, true, "UTF-8"));
        Scanner in = new Scanner(System.in);

        System.out.println("Введите фамилию: ");
        String surname = in.nextLine();

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите отчество: ");
        String patronymic = in.nextLine();

        System.out.println("Привет " + surname + " " + name + " " + patronymic);
        in.close();

    }
}