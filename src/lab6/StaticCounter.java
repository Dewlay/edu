public class StaticCounter {
    // Закрытое статическое целочисленное поле
    private static int counter = 0;
    
    // Статический метод для отображения и увеличения значения
    public static void displayAndIncrement() {
        System.out.println("Текущее значение счетчика: " + counter);
        counter++;
    }
    
    // Дополнительный метод для получения текущего значения
    public static int getCurrentValue() {
        return counter;
    }
    
    // Демонстрация работы класса
    public static void main(String[] args) {
        System.out.println("Демонстрация работы статического счетчика:");
        
        // Вызываем метод несколько раз
        StaticCounter.displayAndIncrement();
        StaticCounter.displayAndIncrement();
        StaticCounter.displayAndIncrement();
        
        System.out.println("\nСоздаем несколько объектов:");
        
        // Создаем несколько объектов для демонстрации
        // что статическое поле общее для всех объектов
        StaticCounter counter1 = new StaticCounter();
        counter1.displayAndIncrement();
        
        StaticCounter counter2 = new StaticCounter();
        counter2.displayAndIncrement();
        
        System.out.println("\nТекущее значение через статический метод: " + 
                          StaticCounter.getCurrentValue());
    }
} 