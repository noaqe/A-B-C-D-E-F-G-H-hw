package org.example;
import java.util.Scanner;


public class replaceA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();  // Считываем строку

        String result = s.replace('a', 'b');

        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') count++;
        }

        System.out.println(result);
        System.out.println(count);
    }
}