package lab8;

import java.io.*;
import java.net.URL;

public class InConvertInText {
    
    public static void readAllByByte(Reader in) throws IOException {
        while (true) {
            int oneByte = in.read(); // читает 1 байт
            if (oneByte != -1) {     // признак конца файла
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "конец");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            // Создание тестового файла
            try (Writer writer = new OutputStreamWriter(
                    new FileOutputStream("MyFile1.txt"), "UTF-8")) {
                writer.write("Тестовая строка для проверки кириллицы\n");
                writer.write("第二行测试 - тест Unicode\n");
                writer.write("Третья строка\n");
            }

            System.out.println("1. Чтение из файла:");
            // С потоком связан файл
            InputStream inFile = new FileInputStream("MyFile1.txt");
            Reader rFile = new InputStreamReader(inFile, "UTF-8");
            readAllByByte(rFile);
            System.out.print("\n\n");
            inFile.close();
            rFile.close();

            System.out.println("2. Чтение с веб-страницы:");
            // С потоком связана интернет-страница
            InputStream inUrl = new URL("http://google.com").openStream();
            Reader rUrl = new InputStreamReader(inUrl, "UTF-8");
            readAllByByte(rUrl);
            System.out.print("\n\n");
            inUrl.close();
            rUrl.close();

            System.out.println("3. Чтение из массива:");
            // С потоком связан массив типа byte
            byte[] array = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 13, 10, 
                            (byte)'П', (byte)'р', (byte)'и', (byte)'в', (byte)'е', (byte)'т'};
            InputStream inArray = new ByteArrayInputStream(array);
            Reader rArray = new InputStreamReader(inArray, "UTF-8");
            readAllByByte(rArray);
            System.out.print("\n\n");
            inArray.close();
            rArray.close();

        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}