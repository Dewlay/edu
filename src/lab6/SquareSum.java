public class SquareSum {
    // Метод для вычисления суммы квадратов через цикл
    public static long calculateSum(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Число должно быть натуральным (больше 0)");
        }
        
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (long) i * i;  // используем long для предотвращения переполнения
        }
        return sum;
    }
    
    // Метод для вычисления суммы по формуле
    public static long calculateSumFormula(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Число должно быть натуральным (больше 0)");
        }
        
        // Используем формулу: (n * (n + 1) * (2n + 1)) / 6
        return (long) n * (n + 1) * (2 * n + 1) / 6;
    }
    
    // Метод для проверки равенства результатов
    public static boolean checkResults(int n) {
        return calculateSum(n) == calculateSumFormula(n);
    }
    
    // Метод для отображения процесса вычисления
    public static void showCalculation(int n) {
        if (n < 1) {
            System.out.println("Ошибка: число должно быть натуральным (больше 0)");
            return;
        }
        
        // Формируем строку с процессом вычисления
        StringBuilder calculation = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            calculation.append(i).append("²");
            if (i < n) {
                calculation.append(" + ");
            }
        }
        
        long result = calculateSum(n);
        long formulaResult = calculateSumFormula(n);
        
        System.out.println("Вычисление суммы квадратов от 1 до " + n + ":");
        System.out.println(calculation + " = " + result);
        System.out.println("Проверка по формуле: " + formulaResult);
        System.out.println("Результаты " + (result == formulaResult ? "совпадают" : "не совпадают") + "\n");
    }
    
    // Демонстрация работы класса
    public static void main(String[] args) {
        System.out.println("Демонстрация вычисления суммы квадратов:\n");
        
        // Тест с разными числами
        showCalculation(3);
        showCalculation(5);
        showCalculation(10);
        
        // Тест с большим числом
        int bigNumber = 100;
        System.out.println("Для числа " + bigNumber + ":");
        long result = calculateSum(bigNumber);
        long formulaResult = calculateSumFormula(bigNumber);
        System.out.println("Результат через сумму: " + result);
        System.out.println("Результат по формуле: " + formulaResult);
        System.out.println("Результаты " + (result == formulaResult ? "совпадают" : "не совпадают") + "\n");
        
        try {
            // Тест с некорректным значением
            showCalculation(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
} 