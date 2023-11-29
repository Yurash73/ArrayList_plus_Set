package Task_1;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {


        List<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int numberInput = 5;

        for (int i = 0; i < numberInput; i++) {
            System.out.println("Введите  слово.  Осталось ввести " +
                    (numberInput - i) + " слов. ");
            String newWord = scanner.nextLine().trim();
            words.add(newWord);
        }
        words.remove(2);

        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(words.size() - i - 1));
        }


    }
}
