package org.example;
import java.util.Scanner;

public class replaceLetB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String result = s.replace('a', 'b').replace('A', 'B');
        int count = 0;

        for (char c : s.toCharArray()) {

            if (c == 'a' || c == 'A') count++;

        }
        System.out.println(result);
        System.out.println(count);
    }
}
