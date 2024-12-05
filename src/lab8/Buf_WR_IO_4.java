package lab8;

import java.io.*;

public class Buf_WR_IO_4 {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            // Создание потоков для чтения и записи с UTF-8 кодировкой
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("MyFile1.txt"), "UTF-8"));

            bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("MyFile2.txt"), "UTF-8"));

            // Переписывание информации из одного файла в другой
            int lineCount = 0; // счетчик строк
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                bw.write(lineCount + ": " + s); // запись без перевода строки
                bw.newLine(); // принудительный переход на новую строку
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!!!!!!");
        } finally {
            try {
                if (br != null) br.close();
                if (bw != null) {
                    bw.flush();
                    bw.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка закрытия потоков: " + e);
            }
        }
    }
}