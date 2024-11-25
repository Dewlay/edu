public class NumberPair {
    // Два целочисленных поля
    private int firstNumber;
    private int secondNumber;
    
    // Приватный метод для использования в конструкторах
    private void displayInitialNumbers() {
        System.out.println("Первое число: " + firstNumber);
        System.out.println("Второе число: " + secondNumber);
        System.out.println();
    }
    
    // Конструктор без аргументов
    public NumberPair() {
        this.firstNumber = 0;
        this.secondNumber = 0;
        System.out.println("Вызван конструктор без аргументов");
        displayInitialNumbers();
    }
    
    // Конструктор с одним аргументом
    public NumberPair(int number) {
        this.firstNumber = number;
        this.secondNumber = number;
        System.out.println("Вызван конструктор с одним аргументом");
        displayInitialNumbers();
    }
    
    // Конструктор с двумя аргументами
    public NumberPair(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        System.out.println("Вызван конструктор с двумя аргументами");
        displayInitialNumbers();
    }
    
    // Метод для отображения значений полей
    public void displayNumbers() {
        System.out.println("Первое число: " + firstNumber);
        System.out.println("Второе число: " + secondNumber);
        System.out.println();
    }
    
    // Методы для получения значений полей
    public int getFirstNumber() {
        return firstNumber;
    }
    
    public int getSecondNumber() {
        return secondNumber;
    }
    
    // Методы для установки значений полей
    public void setFirstNumber(int number) {
        this.firstNumber = number;
    }
    
    public void setSecondNumber(int number) {
        this.secondNumber = number;
    }
    
    // Демонстрация работы класса
    public static void main(String[] args) {
        // Создание объектов с использованием разных конструкторов
        System.out.println("Создание объекта без аргументов:");
        NumberPair pair1 = new NumberPair();
        pair1.displayNumbers();
        
        System.out.println("Создание объекта с одним аргументом:");
        NumberPair pair2 = new NumberPair(10);
        pair2.displayNumbers();

        System.out.println("Создание объекта с двумя аргументами:");
        NumberPair pair3 = new NumberPair(5, 15);
        pair3.displayNumbers();
    }
} 