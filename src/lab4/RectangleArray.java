public class RectangleArray {
    public static void main(String[] args) {
        int width = 23;  // ширина прямоугольника
        int height = 11; // высота прямоугольника
        
        // Создаем двумерный массив
        int[][] rectangle = new int[height][width];
        
        // Заполняем массив цифрами 2
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Заполняем только границы прямоугольника
                if (i == 0 || i == height-1 || j == 0 || j == width-1) {
                    rectangle[i][j] = 2;
                }
            }
        }
        
        // Выводим массив в консоль
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (rectangle[i][j] == 2) {
                    System.out.print("2");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
} 