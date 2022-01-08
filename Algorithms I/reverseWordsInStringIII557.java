/* 
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
*/

class Solution {
    public String reverseWords(String s) {
        int i = 0;
        int j = 0;
        int len = s.length();
        char c[] = s.toCharArray();
        for (int k = 0; k <= len; k++) {
            if (k == len || c[k] == ' ') {
                i = j;
                j = k;
                reverse(c, i, j - 1);
                j++;
            }
        }
        return new String(c);
    }

    void reverse(char[] c, int i, int j) {
        char ch;
        while (j > i) {
            ch = c[i];
            c[i++] = c[j];
            c[j--] = ch;
        }
    }
}