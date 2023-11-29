package Task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
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

        System.out.println("\n Список после удвоения: ");
        myStrings = doubleValues(myStrings);
        for (String line : myStrings) {
            System.out.println(line);
        }
    }

    public static List<String> doubleValues(List<String> stringList) {
        List<String> doubledString = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            doubledString.add(stringList.get(i));
            doubledString.add(stringList.get(i));
        }
        return doubledString;
    }
}
