package org.example;
import java.util.Scanner;

public class LongestWordF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] words = s.trim().split("\\s+");

        String longest = "";
        for (String w : words) {
            if (w.length() > longest.length()) {
                longest = w;
            }
        }
        System.out.println(longest);
        System.out.println(longest.length());
    }
}
