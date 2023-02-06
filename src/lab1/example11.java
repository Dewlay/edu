package lab1;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import static java.lang.System.*;

public class example11 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        setOut(new PrintStream(out, true, "UTF-8"));
        Scanner in = new Scanner(System.in);
        
        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();
        System.out.println("Имя: " + name);
        
        System.out.println("Введите ваш год рождения: ");
        int byear = in.nextInt();
        int year = 2023;
        int yo = year - byear;
        System.out.println("Ваш возраст: " + yo + " года");
        

    
        in.close();
    }
}