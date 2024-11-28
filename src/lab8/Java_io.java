package lab8;

import java.io.*;

public class Java_io {
    public static void main(String[] args) {
        // Создаем директорию для наших тестов
        File directory = new File("testFiles");
        if (!directory.exists()) {
            directory.mkdir();
            System.out.println("Создана директория: " + directory.getAbsolutePath());
        }

        // Пути к тестовым файлам
        File textFile = new File(directory, "text.txt");
        File binaryFile = new File(directory, "data.bin");
        File randomFile = new File(directory, "random.dat");

        try {
            // 1. Запись текста через символьный поток
            try (FileWriter writer = new FileWriter(textFile)) {
                writer.write("Привет, мир!\n");
                writer.write("Это тест символьного потока.\n");
                System.out.println("Записан текстовый файл");
            }

            // 2. Чтение текста через символьный поток
            try (FileReader reader = new FileReader(textFile)) {
                char[] buffer = new char[1024];
                int charCount = reader.read(buffer);
                System.out.println("\nПрочитано из текстового файла:");
                System.out.println(new String(buffer, 0, charCount));
            }

            // 3. Запись байтов через байтовый поток
            try (FileOutputStream fos = new FileOutputStream(binaryFile)) {
                byte[] data = {65, 66, 67, 68, 69}; // ABCDE в ASCII
                fos.write(data);
                System.out.println("Записан бинарный файл");
            }

            // 4. Чтение байтов через байтовый поток
            try (FileInputStream fis = new FileInputStream(binaryFile)) {
                System.out.println("\nПрочитано из бинарного файла:");
                int byteData;
                while ((byteData = fis.read()) != -1) {
                    System.out.print((char)byteData + " ");
                }
                System.out.println();
            }

            // 5. Работа с произвольным доступом
            try (RandomAccessFile raf = new RandomAccessFile(randomFile, "rw")) {
                // Запись данных
                raf.writeInt(100);
                raf.writeDouble(3.14);
                raf.writeUTF("Тестовая строка");

                // Чтение с начала файла
                raf.seek(0);
                System.out.println("\nПрочитано из файла с произвольным доступом:");
                System.out.println("Целое число: " + raf.readInt());
                System.out.println("Дробное число: " + raf.readDouble());
                System.out.println("Строка: " + raf.readUTF());
            }

            // 6. Информация о файлах
            System.out.println("\nИнформация о файлах:");
            System.out.println("Текстовый файл:");
            printFileInfo(textFile);
            System.out.println("Бинарный файл:");
            printFileInfo(binaryFile);
            System.out.println("Файл с произвольным доступом:");
            printFileInfo(randomFile);

        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлами: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void printFileInfo(File file) {
        System.out.println("  Путь: " + file.getAbsolutePath());
        System.out.println("  Размер: " + file.length() + " байт");
        System.out.println("  Можно читать: " + file.canRead());
        System.out.println("  Можно писать: " + file.canWrite());
        System.out.println();
    }
}