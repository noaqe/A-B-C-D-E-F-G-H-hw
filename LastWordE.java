package org.example;
import java.util.Scanner;

public class LastWordE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        s = s.trim();

        int lastSpaceIndex = s.lastIndexOf(' ');
        String lastWord;

        if (lastSpaceIndex == -1) {
            lastWord = s;
        } else {
            lastWord = s.substring(lastSpaceIndex + 1);
        }

        System.out.println(lastWord);
    }
}
