package Task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        List<String> myStrings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int numberOfWords = 10;

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println("Введите слово, осталось ввести " +
                    (numberOfWords - i) + " слов: ");
            myStrings.add(scanner.nextLine());
        }
        System.out.println("\n Исходный список: ");
        for (String line : myStrings) {
            System.out.println(line);
        }
        boolean isSorted = true;
        for (int i = 1; i < myStrings.size(); i++) {
            if (myStrings.get(i).length() < myStrings.get(i - 1).length()) {
                System.out.println(i + "-й строка списка короче предыдущей. Проверяй. ");
                System.out.println(myStrings.get(i - 1));
                System.out.println(myStrings.get(i));
                isSorted = false;
                break;
            }

        }
        if (isSorted) {
            System.out.println("Список упорядочен по возрастанию:");
            for (String line : myStrings) {
                System.out.println(line);
            }
        }
    }
}
