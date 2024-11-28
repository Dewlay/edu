// Суперкласс
class SuperText {
    // Приватное текстовое поле
    private String text;
    
    // Конструктор с текстовым параметром
    public SuperText(String text) {
        this.text = text;
    }
    
    // Переопределение метода toString()
    @Override
    public String toString() {
        return "SuperText{text='" + text + "'}";
    }
}

// Подкласс
class SubText extends SuperText {
    // Дополнительное приватное текстовое поле
    private String additionalText;
    
    // Конструктор с одним параметром
    public SubText(String text) {
        super(text);  // Вызов конструктора суперкласса
        this.additionalText = "не задан";
    }
    
    // Конструктор с двумя параметрами
    public SubText(String text, String additionalText) {
        super(text);  // Вызов конструктора суперкласса
        this.additionalText = additionalText;
    }
    
    // Переопределение метода toString()
    @Override
    public String toString() {
        return "SubText{" + super.toString() + ", additionalText='" + additionalText + "'}";
    }
}

// Главный класс для демонстрации
public class TextClasses {
    public static void main(String[] args) {
        // Создание объекта суперкласса
        SuperText superObj = new SuperText("Текст суперкласса");
        System.out.println("Объект суперкласса:");
        System.out.println(superObj);
        
        System.out.println("\nОбъекты подкласса:");
        
        // Создание объекта подкласса с одним параметром
        SubText subObj1 = new SubText("Текст подкласса");
        System.out.println("С одним параметром:");
        System.out.println(subObj1);
        
        // Создание объекта подкласса с двумя параметрами
        SubText subObj2 = new SubText("Первый текст", "Второй текст");
        System.out.println("\nС двумя параметрами:");
        System.out.println(subObj2);
        
        // Демонстрация полиморфизма
        System.out.println("\nДемонстрация полиморфизма:");
        SuperText polyObj = new SubText("Полиморфный текст", "Дополнительный текст");
        System.out.println(polyObj);
    }
} 