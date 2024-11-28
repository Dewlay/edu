// Первый класс
class First {
    // Открытое символьное поле
    public char symbol;
    
    // Конструктор с параметром
    public First(char symbol) {
        this.symbol = symbol;
    }
    
    // Конструктор копирования
    public First(First obj) {
        this.symbol = obj.symbol;
    }
    
    // Переопределение метода toString()
    @Override
    public String toString() {
        return "First{symbol='" + symbol + "'}";
    }
}

// Второй класс
class Second extends First {
    // Открытое текстовое поле
    public String text;
    
    // Конструктор с параметрами
    public Second(char symbol, String text) {
        super(symbol);  // Вызов конструктора суперкласса
        this.text = text;
    }
    
    // Конструктор копирования
    public Second(Second obj) {
        super(obj);  // Вызов конструктора копирования суперкласса
        this.text = obj.text;
    }
    
    // Переопределение метода toString()
    @Override
    public String toString() {
        return "Second{" + super.toString() + ", text='" + text + "'}";
    }
}

// Третий класс
class Third extends Second {
    // Открытое целочисленное поле
    public int number;
    
    // Конструктор с параметрами
    public Third(char symbol, String text, int number) {
        super(symbol, text);  // Вызов конструктора суперкласса
        this.number = number;
    }
    
    // Конструктор копирования
    public Third(Third obj) {
        super(obj);  // Вызов конструктора копирования суперкласса
        this.number = obj.number;
    }
    
    // Переопределение метода toString()
    @Override
    public String toString() {
        return "Third{" + super.toString() + ", number=" + number + "}";
    }
}

// Главный класс для демонстрации
public class ThreeClassChainCopy {
    public static void main(String[] args) {
        System.out.println("Демонстрация работы классов:\n");
        
        // Создание объектов первого класса
        First first1 = new First('A');
        First first2 = new First(first1);  // Создание копии
        
        System.out.println("Объекты первого класса:");
        System.out.println("Оригинал: " + first1);
        System.out.println("Копия:    " + first2);
        
        // Изменение оригинала для демонстрации независимости копии
        first1.symbol = 'B';
        System.out.println("\nПосле изменения оригинала:");
        System.out.println("Оригинал: " + first1);
        System.out.println("Копия:    " + first2);
        
        // Создание объектов второго класса
        Second second1 = new Second('C', "Привет");
        Second second2 = new Second(second1);  // Создание копии
        
        System.out.println("\nОбъекты второго класса:");
        System.out.println("Оригинал: " + second1);
        System.out.println("Копия:    " + second2);
        
        // Изменение оригинала
        second1.symbol = 'D';
        second1.text = "Пока";
        System.out.println("\nПосле изменения оригинала:");
        System.out.println("Оригинал: " + second1);
        System.out.println("Копия:    " + second2);
        
        // Создание объектов третьего класса
        Third third1 = new Third('E', "Текст", 100);
        Third third2 = new Third(third1);  // Создание копии
        
        System.out.println("\nОбъекты третьего класса:");
        System.out.println("Оригинал: " + third1);
        System.out.println("Копия:    " + third2);
        
        // Изменение оригинала
        third1.symbol = 'F';
        third1.text = "Новый текст";
        third1.number = 200;
        System.out.println("\nПосле изменения оригинала:");
        System.out.println("Оригинал: " + third1);
        System.out.println("Копия:    " + third2);
    }
} 