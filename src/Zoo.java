import java.util.ArrayList;

public class Zoo {
    public static void zoo() {

        ArrayList<String> animals = new ArrayList<>();   // Створюємо список
        animals.add(0, "Lion");
        animals.add(1, "Frog");
        animals.add(2, "Snake");
        animals.add(3, "Gorilla");
        animals.add(4, "Horse");
        animals.add(5, "Bull");         // Перелік тварин
        animals.add(6, "Giraffe");
        animals.add(7, "Cow");
        animals.add(8, "Rhinoceros");
        animals.add(9, "Sheep");
        animals.add(10, "Dog");
        animals.add(11, "Cat");
        animals.add(12, "Bat");
        System.out.println("Список animals - " + animals);   // Виводимо в консоль список
        System.out.println("Список складається із " + animals.size() + " елементів");   // Виводимо в консоль розмір списку

        animals.remove(3);
        animals.remove(5);  // Видаляємо індекси 3 ,5 ,7 зі списку
        animals.remove(7);


        System.out.println();

        System.out.println("Список animals без позицій 3, 5, 7 - " + animals);         // Виводимо в консоль список з видаленими індексами
        System.out.println("Список складається із " + animals.size() + " елементів"); // Виводимо в консоль розмір списку з видаленими індексами

    }

    public static void main(String[] args) {
        zoo();
    }
}
