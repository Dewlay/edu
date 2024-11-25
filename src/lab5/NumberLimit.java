public class NumberLimit {
    // Закрытое целочисленное поле
    private int number;
    
    // Конструктор без аргументов
    public NumberLimit() {
        setNumber();
        System.out.println("Вызван конструктор без аргументов");
        displayNumber();
    }
    
    // Конструктор с аргументом
    public NumberLimit(int value) {
        setNumber(value);
        System.out.println("Вызван конструктор с аргументом");
        displayNumber();
    }
    
    // Метод для присваивания значения без аргументов
    public void setNumber() {
        this.number = 0;
        System.out.println("Вызван метод setNumber() без аргументов");
    }
    
    // Метод для присваивания значения с аргументом
    public void setNumber(int value) {
        // Если значение больше 100, присваиваем 100
        if (value > 100) {
            this.number = 100;
            System.out.println("Значение было ограничено до 100");
        } else {
            this.number = value;
        }
        System.out.println("Вызван метод setNumber() с аргументом: " + value);
    }
    
    // Метод для проверки значения поля
    public int getNumber() {
        return number;
    }
    
    // Метод для отображения текущего значения
    public void displayNumber() {
        System.out.println("Текущее значение поля: " + number);
        System.out.println();
    }
    
    // Демонстрация работы класса
    public static void main(String[] args) {
        // Создание объекта без аргументов
        System.out.println("Создание объекта без аргументов:");
        NumberLimit num1 = new NumberLimit();
        
        // Создание объекта со значением меньше 100
        System.out.println("Создание объекта со значением 75:");
        NumberLimit num2 = new NumberLimit(75);
        
        // Создание объекта со значением больше 100
        System.out.println("Создание объекта со значением 150:");
        NumberLimit num3 = new NumberLimit(150);
        
        // Демонстрация работы методов
        System.out.println("Изменение значений через методы:");
        num1.setNumber(50);
        num1.displayNumber();
        
        num1.setNumber();  // сброс в 0
        num1.displayNumber();
        
        num1.setNumber(200);  // попытка установить значение больше 100
        num1.displayNumber();
    }
} 