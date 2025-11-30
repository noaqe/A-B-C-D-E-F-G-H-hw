package org.example;
import java.util.Scanner;

public class HowManyWordsG    {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();


        s = s.trim();

        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] words = s.split("\\s+");

        System.out.println(words.length);
    }
}
