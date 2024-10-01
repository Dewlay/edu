import java.util.Scanner;

//Версия с вложенными условными операторами
public class example2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название дня недели: ");
        String dayName = scanner.nextLine().toLowerCase();
        int dayNumber;
        if (dayName.equals("понедельник")) {
            dayNumber = 1;
        } else if (dayName.equals("вторник")) {
            dayNumber = 2;
        } else if (dayName.equals("среда")) {
            dayNumber = 3;
        } else if (dayName.equals("четверг")) {
            dayNumber = 4;
        } else if (dayName.equals("пятница")) {
            dayNumber = 5;
        } else if (dayName.equals("суббота")) {
            dayNumber = 6;
        } else if (dayName.equals("воскресенье")) {
            dayNumber = 7;
        } else {
            dayNumber = -1;
        }
        if (dayNumber == -1) {
            System.out.println("Такого дня нет.");
        } else {
            System.out.println("Это " + dayNumber + "-й день недели.");
        }
    }
}