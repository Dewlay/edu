public class DeleteRowColumn {
    public static void main(String[] args) {
        // Размеры исходного массива
        int rows = 4;
        int cols = 6;
        
        // Создаем и инициализируем исходный массив
        int[][] originalArray = new int[rows][cols];
        
        // Заполняем случайными числами
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                originalArray[i][j] = (int)(Math.random() * 100);
            }
        }
        
        // Генерируем случайные индексы для удаления
        int deleteRow = (int)(Math.random() * rows);
        int deleteCol = (int)(Math.random() * cols);
        
        // Выводим исходный массив
        System.out.println("Исходный массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", originalArray[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("\nУдаляем строку: " + deleteRow);
        System.out.println("Удаляем столбец: " + deleteCol);
        
        // Создаем новый массив с уменьшенными размерами
        int[][] newArray = new int[rows-1][cols-1];
        
        // Копируем элементы, пропуская удаляемые строку и столбец
        for (int i = 0, newI = 0; i < rows; i++) {
            if (i == deleteRow) continue; // Пропускаем удаляемую строку
            
            for (int j = 0, newJ = 0; j < cols; j++) {
                if (j == deleteCol) continue; // Пропускаем удаляемый столбец
                newArray[newI][newJ] = originalArray[i][j];
                newJ++;
            }
            newI++;
        }
        
        // Выводим получившийся массив
        System.out.println("\nПолучившийся массив:");
        for (int i = 0; i < rows-1; i++) {
            for (int j = 0; j < cols-1; j++) {
                System.out.printf("%4d", newArray[i][j]);
            }
            System.out.println();
        }
    }
} 