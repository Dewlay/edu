public class Triangle {
    public static void main(String[] args) {
        int height = 10; // высота треугольника
        
        // Внешний цикл для строк
        for (int i = 0; i < height; i++) {
            // Внутренний цикл для символов в каждой строке
            for (int j = 0; j <= i; j++) {
                // Проверяем, находимся ли мы на границе треугольника
                if (j == 0 || j == i || i == height-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Переход на новую строку
            System.out.println();
        }
    }
} 