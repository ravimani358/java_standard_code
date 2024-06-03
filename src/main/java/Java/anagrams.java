package Java;

import java.util.Arrays;

public class anagrams {

    public static boolean areAnagrams(String word1, String word2) {
        String cleanWord1 = word1.replaceAll("\\s", "").toLowerCase();
        String cleanWord2 = word2.replaceAll("\\s", "").toLowerCase();

        if (cleanWord1.length() != cleanWord2.length()) {
            return false;
        }

        char[] charArray1 = cleanWord1.toCharArray();
        char[] charArray2 = cleanWord2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";
        if (areAnagrams(word1, word2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an Anagram");
        }

        String word3 = "Hello";
        String word4 = "World";
        if (areAnagrams(word3, word4)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an Anagram");
        }
    }
}
