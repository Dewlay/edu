import java.util.Scanner;

//Версия с оператором `switch`
public class example2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название дня недели: ");
        String dayName = scanner.nextLine().toLowerCase();
        int dayNumber;
        switch (dayName) {
            case "понедельник":
                dayNumber = 1;
                break;
            case "вторник":
                dayNumber = 2;
                break;
            case "среда":
                dayNumber = 3;
                break;
            case "четверг":
                dayNumber = 4;
                break;
            case "пятница":
                dayNumber = 5;
                break;
            case "суббота":
                dayNumber = 6;
                break;
            case "воскресенье":
                dayNumber = 7;
                break;
            default:
                dayNumber = -1;
                break;
        }
        if (dayNumber == -1) {
            System.out.println("Такого дня нет.");
        } else {
            System.out.println("Это " + dayNumber + "-й день недели.");
        }
    }
}