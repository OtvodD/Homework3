import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
                "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random rand = new Random();
        int task = rand.nextInt(words.length);
        String quiz = words[task];

        System.out.println("Угадайте слово: ");

        Scanner sc = new Scanner(System.in);
        String sol;
        do {

            sol = sc.nextLine();

            if (quiz.equals(sol)) {
                System.out.println("Вы угадали слово: " + quiz + "!");
            } else {
                adv(quiz, sol);
            }
        }
        while (!quiz.equals(sol));
    }

            static void adv (String quiz, String sol) {
                String answer = "";

                for (int i = 0; i < 15; i++) {

                   if (i >= quiz.length() || i >= sol.length()) {
                        answer += "#";
                   }
                    else if (quiz.charAt(i) == sol.charAt(i)) {
                        answer += sol.charAt(i);
                    } else {
                        answer += "#";
                    }

            }
                System.out.println(answer);
    }
}
