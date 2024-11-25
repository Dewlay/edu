public class MinMaxPair {
    // Закрытые целочисленные поля
    private int max;
    private int min;
    
    // Конструктор без аргументов
    public MinMaxPair() {
        this.max = 0;
        this.min = 0;
        System.out.println("Вызван конструктор без аргументов");
        displayValues();
    }
    
    // Конструктор с одним аргументом
    public MinMaxPair(int value) {
        setValues(value);
        System.out.println("Вызван конструктор с одним аргументом");
        displayValues();
    }
    
    // Конструктор с двумя аргументами
    public MinMaxPair(int value1, int value2) {
        setValues(value1, value2);
        System.out.println("Вызван конструктор с двумя аргументами");
        displayValues();
    }
    
    // Метод для установки значений с одним аргументом
    public void setValues(int value) {
        // Сравниваем новое значение с текущими
        if (value > max) {
            max = value;
        } else if (value < min) {
            min = value;
        }
        System.out.println("Вызван метод setValues с одним аргументом: " + value);
    }
    
    // Метод для установки значений с двумя аргументами
    public void setValues(int value1, int value2) {
        // Определяем максимальное и минимальное из всех значений
        max = Math.max(Math.max(max, value1), value2);
        min = Math.min(Math.min(min, value1), value2);
        System.out.println("Вызван метод setValues с аргументами: " + value1 + ", " + value2);
    }
    
    // Метод для отображения значений
    public void displayValues() {
        System.out.println("Максимальное значение (max): " + max);
        System.out.println("Минимальное значение (min): " + min);
        System.out.println();
    }
    
    // Геттеры для полей
    public int getMax() {
        return max;
    }
    
    public int getMin() {
        return min;
    }
    
    // Демонстрация работы класса
    public static void main(String[] args) {
        // Создание объекта без аргументов
        System.out.println("Создание объекта без аргументов:");
        MinMaxPair pair1 = new MinMaxPair();
        
        // Создание объекта с одним аргументом
        System.out.println("Создание объекта со значением 10:");
        MinMaxPair pair2 = new MinMaxPair(10);
        
        // Создание объекта с двумя аргументами
        System.out.println("Создание объекта со значениями 5 и 15:");
        MinMaxPair pair3 = new MinMaxPair(5, 15);
        
        // Демонстрация работы методов
        System.out.println("Изменение значений через методы:");
        pair1.setValues(7);
        pair1.displayValues();
        
        pair1.setValues(3, 12);
        pair1.displayValues();
        
        pair1.setValues(1);
        pair1.displayValues();
    }
} 