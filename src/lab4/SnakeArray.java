public class SnakeArray {
    public static void main(String[] args) {
        int rows = 7;    // количество строк
        int cols = 10;   // количество столбцов
        int[][] array = new int[rows][cols];
        int value = 1;   // начальное значение для заполнения
        
        // Заполняем массив
        for (int i = 0; i < rows; i++) {
            // Если строка четная - заполняем слева направо
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    array[i][j] = value++;
                }
            }
            // Если строка нечетная - заполняем справа налево
            else {
                for (int j = cols - 1; j >= 0; j--) {
                    array[i][j] = value++;
                }
            }
        }
        
        // Выводим массив
        System.out.println("Массив, заполненный змейкой:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
    }
} 