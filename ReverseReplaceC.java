package org.example;
import java.util.Scanner;

public class ReverseReplaceC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        StringBuilder result = new StringBuilder();
        int count = 0;

        for (char c : s.toCharArray()) {
            switch (c) {
                case 'a':
                    result.append('b');
                    count++;
                    break;
                case 'b':
                    result.append('a');
                    count++;
                    break;
                case 'A':
                    result.append('B');
                    count++;
                    break;
                case 'B':
                    result.append('A');
                    count++;
                    break;
                default:
                    result.append(c);
                    break;
            }
        }
        System.out.println(result);
        System.out.println(count);
    }
}
