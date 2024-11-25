public class CharacterDemo {
    // Закрытое символьное поле
    private char symbol;
    
    // Метод для присвоения значения полю
    public void setSymbol(char newSymbol) {
        symbol = newSymbol;
    }
    
    // Метод для получения кода символа
    public int getSymbolCode() {
        return (int) symbol;
    }
    
    // Метод для вывода символа и его кода
    public void displaySymbolInfo() {
        System.out.println("Символ: " + symbol);
        System.out.println("Код символа: " + (int) symbol);
    }
    
    // Демонстрация работы класса
    public static void main(String[] args) {
        // Создаем объект класса
        CharacterDemo demo = new CharacterDemo();
        
        // Присваиваем значение полю
        demo.setSymbol('A');
        
        // Получаем и выводим код символа
        System.out.println("Получен код символа: " + demo.getSymbolCode());
        
        // Выводим информацию о символе
        demo.displaySymbolInfo();
        
        // Демонстрация с другим символом
        demo.setSymbol('Я');
        demo.displaySymbolInfo();
    }
} 