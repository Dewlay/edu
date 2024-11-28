// Суперкласс
class SuperTextClass {
    // Приватное текстовое поле
    private String text;
    
    // Конструктор с текстовым параметром
    public SuperTextClass(String text) {
        setText(text);
    }
    
    // Метод для присваивания значения текстовому полю
    public void setText(String text) {
        this.text = text != null ? text : "пустой текст";
    }
    
    // Метод для получения длины строки
    public int getTextLength() {
        return text.length();
    }
    
    // Метод для получения значения текстового поля
    public String getText() {
        return text;
    }
    
    // Переопределение метода toString()
    @Override
    public String toString() {
        return "SuperTextClass{text='" + text + "'}";
    }
}

// Подкласс
class SubTextClass extends SuperTextClass {
    // Публичное целочисленное поле
    public int number;
    
    // Конструктор с двумя параметрами
    public SubTextClass(String text, int number) {
        super(text);
        this.number = number;
    }
    
    // Метод без параметров
    public void setValues() {
        setText("значение по умолчанию");
        number = 0;
    }
    
    // Метод с текстовым параметром (переопределение)
    @Override
    public void setText(String text) {
        super.setText(text);
    }
    
    // Метод с целочисленным параметром
    public void setValues(int number) {
        this.number = number;
    }
    
    // Метод с текстовым и целочисленным параметром
    public void setValues(String text, int number) {
        setText(text);
        this.number = number;
    }
    
    // Переопределение метода toString()
    @Override
    public String toString() {
        return "SubTextClass{" + super.toString() + ", number=" + number + "}";
    }
}

// Главный класс для демонстрации
public class TextNumberClasses {
    public static void main(String[] args) {
        System.out.println("Демонстрация работы классов:\n");
        
        // Создание объекта суперкласса
        SuperTextClass superObj = new SuperTextClass("Текст суперкласса");
        System.out.println("Объект суперкласса:");
        System.out.println(superObj);
        System.out.println("Длина текста: " + superObj.getTextLength());
        
        // Создание объекта подкласса
        SubTextClass subObj = new SubTextClass("Начальный текст", 100);
        System.out.println("\nОбъект подкласса после создания:");
        System.out.println(subObj);
        
        // Демонстрация различных методов установки значений
        System.out.println("\nДемонстрация методов установки значений:");
        
        // Метод без параметров
        subObj.setValues();
        System.out.println("После setValues():");
        System.out.println(subObj);
        
        // Метод с текстовым параметром
        subObj.setText("Новый текст");
        System.out.println("\nПосле setText():");
        System.out.println(subObj);
        
        // Метод с целочисленным параметром
        subObj.setValues(42);
        System.out.println("\nПосле setValues(42):");
        System.out.println(subObj);
        
        // Метод с двумя параметрами
        subObj.setValues("Финальный текст", 999);
        System.out.println("\nПосле setValues(текст, число):");
        System.out.println(subObj);
        
        // Проверка длины текста
        System.out.println("Длина текста: " + subObj.getTextLength());
    }
} 