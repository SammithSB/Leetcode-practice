/*
 * Given a string s, find the length of the longest substring without repeating
 * characters.
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start_pointer = 0;
        int end_pointer = 0;
        int max = 0;
        HashSet<Character> hash_set = new HashSet();
        while (end_pointer < s.length()) {
            if (!(hash_set.contains(s.charAt(end_pointer)))) {
                hash_set.add(s.charAt(end_pointer));
                end_pointer++;
                max = Math.max(max, hash_set.size());
            } else {
                hash_set.remove(s.charAt(start_pointer));
                start_pointer++;
            }
        }
        return max;
    }
}