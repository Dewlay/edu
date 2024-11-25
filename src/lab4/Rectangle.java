public class Rectangle {
    public static void main(String[] args) {
        int width = 23;  // ширина прямоугольника
        int height = 11; // высота прямоугольника
        
        // Цикл для вывода строк
        for (int i = 0; i < height; i++) {
            // Цикл для вывода символов в каждой строке
            for (int j = 0; j < width; j++) {
                // Проверяем, является ли текущая позиция границей прямоугольника
                if (i == 0 || i == height-1 || j == 0 || j == width-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Переход на новую строку после каждой строки прямоугольника
            System.out.println();
        }
    }
}