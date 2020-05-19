package bot;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Aid", "2018"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        String q = "Why do we use methods?";
        System.out.println(q);
        Map<Integer, String> queMap = new HashMap<>();
        int[] answers = {1, 2, 3, 4};
        String[] soln = {
                "To repeat a statement multiple times.",
                "To decompose a program into several small subroutines.",
                "To determine the execution time of a program.",
                "To interrupt the execution of a program."
        };
        int i = 0;
        while (i < soln.length) {
            queMap.put(answers[i], soln[i]);
            i++;
        }

        for (Map.Entry<Integer, String> entry : queMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("%d. %s\n", key, value);
        }

        System.out.print("> ");
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        while (scanner.hasNext()) {
            answer = scanner.nextInt();

            if (answer == answers[1]) {
                System.out.println("Congratulations, have a nice day!");
                break;
            }
            else System.out.println("Please, try again");
        }


    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}
