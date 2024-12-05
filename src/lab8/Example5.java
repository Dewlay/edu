package lab8;

import java.io.*;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.print("Введите имя файла => ");
        String fname = sc.nextLine();

        try {
            // Создается файл
            File f1 = new File(fname);
            f1.createNewFile(); // файл создан
            System.out.println("Полный путь файла: " + f1.getAbsolutePath());

            System.out.print("Введите количество строк для записи в файл => ");
            int n = sc.nextInt();
            sc.nextLine(); // очистка буфера

            // Используем FileWriter для записи текста
            try (Writer writer = new OutputStreamWriter(new FileOutputStream(f1), "UTF-8")) {
                for (int i = 0; i < n; i++) {
                    System.out.print("Введите строку для записи в файл => ");
                    String s = sc.nextLine();
                    writer.write(s + "\n");
                }
            }

            // Чтение и вывод данных из созданного файла
            try (Reader reader = new InputStreamReader(new FileInputStream(f1), "UTF-8")) {
                BufferedReader bufferedReader = new BufferedReader(reader);
                String line;
                System.out.println("\nСодержимое файла:");
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}