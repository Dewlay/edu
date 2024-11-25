public class CharIntPair {
    // Символьное и целочисленное поля
    private char charValue;
    private int intValue;
    
    // Конструктор с двумя аргументами
    public CharIntPair(int number, char symbol) {
        this.intValue = number;
        this.charValue = symbol;
        System.out.println("Вызван конструктор с двумя аргументами (int, char)");
        displayValues();
    }
    
    // Конструктор с одним аргументом типа double
    public CharIntPair(double number) {
        // Получаем целую часть для определения символа
        int charCode = (int) number;
        this.charValue = (char) charCode;
        
        // Получаем дробную часть и выделяем десятые и сотые
        double fractional = number - charCode;
        // Умножаем на 100 чтобы получить две цифры после запятой
        // и округляем до целого
        this.intValue = (int) (fractional * 100);
        
        System.out.println("Вызван конструктор с аргументом double: " + number);
        displayValues();
    }
    
    // Метод для отображения значений полей
    public void displayValues() {
        System.out.println("Символ: '" + charValue + "' (код: " + (int)charValue + ")");
        System.out.println("Число: " + intValue);
        System.out.println();
    }
    
    // Геттеры для полей
    public char getCharValue() {
        return charValue;
    }
    
    public int getIntValue() {
        return intValue;
    }
    
    // Демонстрация работы класса
    public static void main(String[] args) {
        // Создание объекта с использованием первого конструктора
        System.out.println("Создание объекта с помощью двух аргументов:");
        CharIntPair pair1 = new CharIntPair(12, 'A');
        
        // Создание объектов с использованием второго конструктора
        System.out.println("Создание объекта с помощью double (65.1267):");
        CharIntPair pair2 = new CharIntPair(65.1267);
        
        System.out.println("Создание объекта с помощью double (66.9876):");
        CharIntPair pair3 = new CharIntPair(66.9876);
    }
} 