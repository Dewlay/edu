// Суперкласс
class SuperClass {
    // Приватное текстовое поле
    private String text;
    
    // Конструктор с текстовым параметром
    public SuperClass(String text) {
        this.text = text;
    }
    
    // Метод для отображения информации об объекте
    public void display() {
        System.out.println("Класс: " + this.getClass().getSimpleName());
        System.out.println("Текст: " + text);
    }
    
    // Геттер для текстового поля (чтобы подклассы могли получить значение)
    protected String getText() {
        return text;
    }
}

// Первый подкласс
class FirstSubClass extends SuperClass {
    // Защищенное целочисленное поле
    protected int number;
    
    // Конструктор с двумя параметрами
    public FirstSubClass(String text, int number) {
        super(text);  // Вызов конструктора суперкласса
        this.number = number;
    }
    
    // Переопределение метода display()
    @Override
    public void display() {
        System.out.println("Класс: " + this.getClass().getSimpleName());
        System.out.println("Текст: " + getText());
        System.out.println("Число: " + number);
    }
}

// Второй подкласс
class SecondSubClass extends SuperClass {
    // Защищенное символьное поле
    protected char symbol;
    
    // Конструктор с двумя параметрами
    public SecondSubClass(String text, char symbol) {
        super(text);  // Вызов конструктора суперкласса
        this.symbol = symbol;
    }
    
    // Переопределение метода display()
    @Override
    public void display() {
        System.out.println("Класс: " + this.getClass().getSimpleName());
        System.out.println("Текст: " + getText());
        System.out.println("Символ: " + symbol);
    }
}

// Главный класс для демонстрации
public class ClassHierarchyDemo {
    public static void main(String[] args) {
        System.out.println("Демонстрация работы классов:\n");
        
        // Создание объекта суперкласса
        SuperClass superObj = new SuperClass("Текст суперкласса");
        System.out.println("Вызов метода display() для объекта суперкласса:");
        superObj.display();
        
        // Создание объекта первого подкласса
        FirstSubClass firstObj = new FirstSubClass("Текст первого подкласса", 100);
        System.out.println("\nВызов метода display() для объекта первого подкласса:");
        firstObj.display();
        
        // Создание объекта второго подкласса
        SecondSubClass secondObj = new SecondSubClass("Текст второго подкласса", 'A');
        System.out.println("\nВызов метода display() для объекта второго подкласса:");
        secondObj.display();
        
        // Демонстрация полиморфизма
        System.out.println("\nДемонстрация полиморфизма:");
        
        SuperClass polymorphObj1 = new FirstSubClass("Полиморфный текст 1", 200);
        System.out.println("\nВызов метода display() через ссылку суперкласса на FirstSubClass:");
        polymorphObj1.display();
        
        SuperClass polymorphObj2 = new SecondSubClass("Полиморфный текст 2", 'B');
        System.out.println("\nВызов метода display() через ссылку суперкласса на SecondSubClass:");
        polymorphObj2.display();
    }
} 