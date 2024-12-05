package lab8;

import java.io.*;

public class Buf_RW_2 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter out = null;

        try {
            // Создание потоков
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("MyFile1.txt"), "UTF-8"));

            out = new PrintWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("MyFile2.txt"), "UTF-8"));

            // Переписывание информации из одного файла в другой
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                out.println(lineCount + ": " + s);
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