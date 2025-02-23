package Anagrams;

import java.util.*;

public class AnagramFinder {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s == null || p == null || s.length() < p.length()) {
            return result;  // Edge case: if s is shorter than p, no anagram can exist
        }

        // Frequency map for characters in p
        int[] pCount = new int[26];
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        // Sliding window variables
        int[] windowCount = new int[26];
        int windowSize = p.length();

        // Traverse the string s with a sliding window
        for (int i = 0; i < s.length(); i++) {
            // Add the current character to the window
            windowCount[s.charAt(i) - 'a']++;

            // Remove the character that is sliding out of the window
            if (i >= windowSize) {
                windowCount[s.charAt(i - windowSize) - 'a']--;
            }

            // Compare windowCount and pCount
            if (Arrays.equals(windowCount, pCount)) {
                result.add(i - windowSize + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> anagramIndices = findAnagrams(s, p);
        System.out.println("Anagram starting indices: " + anagramIndices);

        // Additional test cases
        System.out.println("Test 1: " + findAnagrams("abab", "ab"));  // Output: [0, 1, 2]
        System.out.println("Test 2: " + findAnagrams("aaaaa", "aa"));  // Output: [0, 1, 2, 3]
        System.out.println("Test 3: " + findAnagrams("a", "aa"));      // Output: []
    }
}
