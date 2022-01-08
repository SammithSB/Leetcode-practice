/*
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
*/

class Solution {
    public void reverseString(char[] s) {
        int index = 0;
        for (int i = s.length - 1; i >= s.length / 2; i--) {
            char temp = s[i];
            s[i] = s[index];
            s[index] = temp;
            index++;
        }
    }
}