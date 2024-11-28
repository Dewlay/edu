public class TextCharClass {
    // Поля класса
    private char charValue;
    private String textValue;
    
    // Конструктор без аргументов
    public TextCharClass() {
        this.charValue = '-';
        this.textValue = "пусто";
        System.out.println("Создан объект со значениями по умолчанию");
        displayValues();
    }
    
    // Метод для присваивания символьного значения
    public void setValue(char ch) {
        this.charValue = ch;
        System.out.println("Вызван метод setValue с символом: " + ch);
        displayValues();
    }
    
    // Метод для присваивания текстового значения
    public void setValue(String text) {
        this.textValue = text;
        System.out.println("Вызван метод setValue с текстом: " + text);
        displayValues();
    }
    
    // Метод для присваивания значения из символьного массива
    public void setValue(char[] chars) {
        if (chars.length == 1) {
            // Если массив из одного элемента - присваиваем символьному полю
            this.charValue = chars[0];
            System.out.println("Вызван метод setValue с одиночным символом из массива: " + chars[0]);
        } else if (chars.length > 1) {
            // Если массив из нескольких элементов - формируем строку
            this.textValue = new String(chars);
            System.out.println("Вызван метод setValue с массивом символов: " + new String(chars));
        }
        displayValues();
    }
    
    // Метод для отображения значений полей
    public void displayValues() {
        System.out.println("Символьное поле: '" + charValue + "'");
        System.out.println("Текстовое поле: \"" + textValue + "\"");
        System.out.println();
    }
    
    // Геттеры для полей
    public char getCharValue() {
        return charValue;
    }
    
    public String getTextValue() {
        return textValue;
    }
    
    // Демонстрация работы класса
    public static void main(String[] args) {
        // Создание объекта
        TextCharClass obj = new TextCharClass();
        
        // Тест метода с символьным аргументом
        obj.setValue('A');
        
        // Тест метода с текстовым аргументом
        obj.setValue("Привет");
        
        // Тест метода с символьным массивом из одного элемента
        char[] singleChar = {'B'};
        obj.setValue(singleChar);
        
        // Тест метода с символьным массивом из нескольких элементов
        char[] multiChar = {'H', 'e', 'l', 'l', 'o'};
        obj.setValue(multiChar);
    }
} 