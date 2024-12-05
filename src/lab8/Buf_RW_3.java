package lab8;

import java.io.*;

public class Buf_RW_3 {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter out = null;

        try {
            // Создание файловых потоков с буферизацией
            br = new BufferedReader(
                    new InputStreamReader(new FileInputStream("MyFile1.txt"), "UTF-8"), 1024);
            out = new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream("MyFile2.txt"), "UTF-8"));

            int lineCount = 0; // счетчик строк
            String s;

            // Переписывание информации из одного файла в другой
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.write(s);
                out.newLine(); // переход на новую строку
            }

        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        } finally {
            try {
                if (br != null) br.close();
                if (out != null) {
                    out.flush();
                    out.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка закрытия потоков: " + e);
            }
        }
    }
}