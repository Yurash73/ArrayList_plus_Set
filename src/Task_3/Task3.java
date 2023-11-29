package Task_3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("река");
        strings.add("роль");
        strings.add("лень");
        strings.add("креозот");
        strings.add("балласт");

        System.out.println("Первоначальный список:");
        for (String string : strings)
            System.out.println(string);

        strings = fix(strings);

        System.out.println("Обработанный список:");
        for (String string : strings)
            System.out.println(string);
    }

    public static List<String> fix(List<String> strings) {
        List<String> newStrings = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            String buffer = strings.get(i);
            if (buffer.toLowerCase().contains("р") &&
                    buffer.toLowerCase().contains("л")) {
                System.out.println("Оставляем слово: " + buffer);
                newStrings.add(buffer);
            } else if (buffer.toLowerCase().contains("л")) {
                System.out.println("удваиваем слово: " + buffer);
                newStrings.add(buffer);
                newStrings.add(buffer);
            } else if (buffer.toLowerCase().contains("р")) {
                System.out.println("Удаляем слово:" + buffer);
            } else {
                System.out.println("Оставляем слово: " + buffer);
                newStrings.add(buffer);
            }

        }
        return newStrings;

    }
}
