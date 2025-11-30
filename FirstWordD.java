package org.example;
import java.util.Scanner;

public class FirstWordD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        s = s.trim();

        int spaceIndex = s.indexOf(' ');
        String firstWord;

        if (spaceIndex == -1) {
            firstWord = s;
        } else {
            firstWord = s.substring(0, spaceIndex);
        }

        System.out.println(firstWord);
    }
}