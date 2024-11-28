package lab8;

import java.io.*;
import java.net.URI;

public class Read_out_form_file {
    // Метод для чтения данных из потока по байтам с выводом
    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read(); // читает 1 байт
            if (oneByte != -1) {     // признак отсутствия конца файла
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            // С потоком связан файл
            InputStream inFile = new FileInputStream("lab8/text.txt");
            readAllByByte(inFile);
            System.out.print("\n\n");
            inFile.close();

            // С потоком связана интернет-страница
            InputStream inUrl = URI.create("http://pro-auto.su/").toURL().openStream();
            readAllByByte(inUrl);
            System.out.print("\n\n");
            inUrl.close();

            // С потоком связан массив типа byte
            byte[] array = {7, 9, 3, 7, 4};
            InputStream inArray = new ByteArrayInputStream(array);
            readAllByByte(inArray);
            System.out.print("\n\n");
            inArray.close();

        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}