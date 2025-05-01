package Blatt04.Task2;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    public static boolean isAnagram(String a, String b) {

        int [] c = countLetters(a);
        int [] d = countLetters(b);
        return Arrays.equals(c, d);
    }


    public static int[] countLetters(String s) {
        int[] counts = new int[26];
        s = s.toLowerCase();
        char [] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int i=0 ;i < s.length() ;i++) {
            char a = s.charAt(i);
            for (int b= 0; b < alphabet.length; b++) {
                if (a == alphabet[b]) {
                    counts[b]++;
                    break;
                }
            }
        }
        return counts;
    }

    /**
     * Print only letters that appear in the string with their counts.
     */
    public static void printLetterCounts(String s) {
// TODO: implement nicely formatted output
        int[]a =countLetters(s);
        char [] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int i=0; i<a.length; i++) {
            if (a[i] <= 0) continue;
            else {
                System.out.println(alphabet[i] + ": " + a[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Get two strings from the user
        System.out.print(" Enter the first string: ");
        String word1 = scanner.nextLine();
        System.out.print(" Enter the second string: ");
        String word2 = scanner.nextLine();
// TODO: Process the strings here (ignore spaces , case)
        word1.replaceAll("\\s+","");
        word2.replaceAll("\\s+","");

        System.out.println(" Are they anagrams? " + isAnagram(word1, word2));

        printLetterCounts(word1);
    }
}