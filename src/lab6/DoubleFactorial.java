public class DoubleFactorial {
    // Метод для вычисления двойного факториала
    public static long calculateDoubleFactorial(int n) {
        // Проверка на отрицательное число
        if (n < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным");
        }
        
        // Особые случаи
        if (n == 0 || n == 1) {
            return 1;
        }
        
        // Вычисление двойного факториала
        long result = n;
        for (int i = n - 2; i > 0; i -= 2) {
            result *= i;
        }
        
        return result;
    }
    
    // Рекурсивная версия метода
    public static long calculateDoubleFactorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateDoubleFactorialRecursive(n - 2);
    }
    
    // Метод для отображения процесса вычисления
    public static void showCalculation(int n) {
        if (n < 0) {
            System.out.println("Ошибка: число не может быть отрицательным");
            return;
        }
        
        System.out.print(n + "!! = ");
        
        // Формируем строку с процессом вычисления
        StringBuilder calculation = new StringBuilder();
        for (int i = n; i > 0; i -= 2) {
            calculation.append(i);
            if (i > 2 || (i == 2 && n % 2 == 0)) {
                calculation.append(" × ");
            }
        }
        
        System.out.println(calculation + " = " + calculateDoubleFactorial(n));
    }
    
    // Демонстрация работы класса
    public static void main(String[] args) {
        System.out.println("Демонстрация вычисления двойного факториала:\n");
        
        // Тест с четным числом
        System.out.println("Для четного числа:");
        showCalculation(6);
        
        // Тест с нечетным числом
        System.out.println("\nДля нечетного числа:");
        showCalculation(5);
        
        // Тест с маленькими числами
        System.out.println("\nДля маленьких чисел:");
        showCalculation(0);
        showCalculation(1);
        showCalculation(2);
        
        // Тест с большим числом
        System.out.println("\nДля большого числа:");
        showCalculation(10);
        
        try {
            // Тест с отрицательным числом
            System.out.println("\nДля отрицательного числа:");
            showCalculation(-3);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
} 