public class CharacterRange {
    // Два символьных поля
    private char firstSymbol;
    private char secondSymbol;
    
    // Конструктор для инициализации полей
    public CharacterRange(char first, char second) {
        this.firstSymbol = first;
        this.secondSymbol = second;
    }
    
    // Метод для установки значений полей
    public void setSymbols(char first, char second) {
        this.firstSymbol = first;
        this.secondSymbol = second;
    }
    
    // Метод для вывода символов в диапазоне
    public void displayRange() {
        // Определяем начальный и конечный символы
        char start = (char) Math.min(firstSymbol, secondSymbol);
        char end = (char) Math.max(firstSymbol, secondSymbol);
        
        System.out.println("Символы в диапазоне от '" + start + "' до '" + end + "':");
        
        // Выводим все символы в диапазоне
        for (char c = start; c <= end; c++) {
            System.out.print(c + " ");
        }
        System.out.println(); // Переход на новую строку
        
        // Выводим коды символов
        System.out.println("Коды символов:");
        for (char c = start; c <= end; c++) {
            System.out.println("Символ '" + c + "' имеет код: " + (int)c);
        }
    }
    
    // Демонстрация работы класса
    public static void main(String[] args) {
        // Создаем объект и задаем начальные значения
        CharacterRange range = new CharacterRange('A', 'D');
        
        // Выводим диапазон символов
        range.displayRange();
        
        System.out.println("\nНовый диапазон:");
        // Демонстрация с другими символами
        range.setSymbols('X', 'Z');
        range.displayRange();
    }
} 