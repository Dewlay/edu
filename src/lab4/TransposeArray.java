public class TransposeArray {
    public static void main(String[] args) {
        // Размеры исходного массива
        int rows = 3;
        int cols = 5;
        
        // Создаем исходный массив
        int[][] originalArray = new int[rows][cols];
        
        // Заполняем случайными числами (например, от 0 до 99)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                originalArray[i][j] = (int)(Math.random() * 100);
            }
        }
        
        // Выводим исходный массив
        System.out.println("Исходный массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", originalArray[i][j]);
            }
            System.out.println();
        }
        
        // Создаем новый массив с измененными размерами
        int[][] transposedArray = new int[cols][rows];
        
        // Меняем строки и столбцы местами
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedArray[j][i] = originalArray[i][j];
            }
        }
        
        // Выводим транспонированный массив
        System.out.println("\nТранспонированный массив:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.printf("%4d", transposedArray[i][j]);
            }
            System.out.println();
        }
    }
} 