// Первый класс (суперкласс)
class Alpha {
    // Открытое целочисленное поле
    public int number;
    
    // Конструктор с одним параметром
    public Alpha(int number) {
        setValue(number);
    }
    
    // Метод для присваивания значения полю
    public void setValue(int number) {
        this.number = number;
    }
    
    // Переопределение метода toString()
    @Override
    public String toString() {
        return "Alpha{number=" + number + "}";
    }
}

// Второй класс (наследует Alpha)
class Bravo extends Alpha {
    // Открытое символьное поле
    public char symbol;
    
    // Конструктор с двумя параметрами
    public Bravo(int number, char symbol) {
        super(number);  // Вызов конструктора суперкласса
        setValue(number, symbol);
    }
    
    // Перегруженный метод для присваивания значений полям
    public void setValue(int number, char symbol) {
        setValue(number);  // Вызов метода суперкласса
        this.symbol = symbol;
    }
    
    // Переопределение метода toString()
    @Override
    public String toString() {
        return "Bravo{" + super.toString() + ", symbol='" + symbol + "'}";
    }
}

// Третий класс (наследует Bravo)
class Charlie extends Bravo {
    // Открытое текстовое поле
    public String text;
    
    // Конструктор с тремя параметрами
    public Charlie(int number, char symbol, String text) {
        super(number, symbol);  // Вызов конструктора суперкласса
        setValue(number, symbol, text);
    }
    
    // Перегруженный метод для присваивания значений полям
    public void setValue(int number, char symbol, String text) {
        setValue(number, symbol);  // Вызов метода суперкласса
        this.text = text;
    }
    
    // Переопределение метода toString()
    @Override
    public String toString() {
        return "Charlie{" + super.toString() + ", text='" + text + "'}";
    }
}

// Главный класс для демонстрации
public class ThreeClassChain {
    public static void main(String[] args) {
        System.out.println("Демонстрация работы классов:\n");
        
        // Создание объекта первого класса
        Alpha alpha = new Alpha(100);
        System.out.println("Объект класса Alpha:");
        System.out.println(alpha);
        
        // Изменение значения и повторный вывод
        alpha.setValue(200);
        System.out.println("После изменения значения:");
        System.out.println(alpha);
        
        // Создание объекта второго класса
        Bravo bravo = new Bravo(300, 'B');
        System.out.println("\nОбъект класса Bravo:");
        System.out.println(bravo);
        
        // Изменение значений и повторный вывод
        bravo.setValue(400, 'D');
        System.out.println("После изменения значений:");
        System.out.println(bravo);
        
        // Создание объекта третьего класса
        Charlie charlie = new Charlie(500, 'E', "текст");
        System.out.println("\nОбъект класса Charlie:");
        System.out.println(charlie);
        
        // Изменение значений и повторный вывод
        charlie.setValue(600, 'F', "новый текст");
        System.out.println("После изменения значений:");
        System.out.println(charlie);
        
        // Демонстрация полиморфизма
        System.out.println("\nДемонстрация полиморфизма:");
        Alpha[] objects = {
            new Alpha(1000),
            new Bravo(2000, 'X'),
            new Charlie(3000, 'Y', "полиморфизм")
        };
        
        for (Alpha obj : objects) {
            System.out.println(obj);
        }
    }
} 