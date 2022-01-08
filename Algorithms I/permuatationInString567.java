/*
Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
*/

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1len = s1.length();
        int s2len = s2.length();
        int[] array1 = new int[26];
        int[] array2 = new int[26];
        if (s1len > s2len) {
            return false;
        }
        for (int i = 0; i < s1len; i++) {
            array1[s1.charAt(i) - 'a']++;
            array2[s2.charAt(i) - 'a']++;
        }
        for (int i = s1len; i < s2len; i++) {
            if (Arrays.equals(array1, array2)) {
                return true;
            }
            array2[s2.charAt(i - s1len) - 'a']--;
            array2[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(array1, array2))
            return true;
        else
            return false;
    }
}