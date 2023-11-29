package Task_2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        words.add("мама");
        words.add("мыла");
        words.add("раму");
        int sizeOfList = words.size();

        for (int i = 0; i < sizeOfList; i++) {

            words.add(i * 2 + 1, "именно");
        }

        words.forEach((String forPrint) -> System.out.println(forPrint));
    }
}
