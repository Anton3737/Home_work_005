package Task_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void Teacher() {
        System.out.println("Введіть прізвище викладача: ");
        Scanner in = new Scanner(System.in);   // Через сканер вводимо Прізвище
        String teacher = in.nextLine();

        ArrayList<String> teachers = new ArrayList<>();
        teachers.add(0, "Стежко");
        teachers.add(1, "Ковшова");
        teachers.add(2, "Бурбелло");    // Перелік викладачів
        teachers.add(3, "Тюх");
        teachers.add(4, "Шмалій");

        if (teacher.equals("Стежко")) {
            System.out.println("The best of the best ");
        } else if (teacher.equals("Шмалій")) {
            System.out.println("Oh ***t, it's her again");
        } else if (teacher.equals("Ковшова")) {                        // Через цикл ІФ проганяємо запит Сканера та виводимо результат
            System.out.println("Veri nice teacher");
        } else if (teacher.equals("Бурбелло")) {
            System.out.println("nice teacher");
        }
        if (teacher.equals("Тюх")) {
            System.out.println("Good teacher");
        }
    }

    public static void main(String[] args) {
        Teacher();
    }
}
