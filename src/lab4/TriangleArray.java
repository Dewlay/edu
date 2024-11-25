public class TriangleArray {
    public static void main(String[] args) {
        int height = 10; // высота треугольника
        
        // Создаем двумерный массив (размер второй размерности равен высоте,
        // так как это максимальная ширина треугольника)
        int[][] triangle = new int[height][height];
        
        // Заполняем массив цифрами 2
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                // Заполняем только границы треугольника
                if (j == 0 || j == i || i == height-1) {
                    triangle[i][j] = 2;
                }
            }
        }
        
        // Выводим массив в консоль
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                if (triangle[i][j] == 2) {
                    System.out.print("2");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
} 