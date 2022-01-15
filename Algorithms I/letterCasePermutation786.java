/*
 * Given a string s, you can transform every letter individually to be lowercase
 * or uppercase to create another string.
 * 
 * Return a list of all possible strings we could create. Return the output in
 * any order.
 * 
 * Input: s = "a1b2"
 * Output: ["a1b2","a1B2","A1b2","A1B2"]
 */

class Solution {
    public List<String> letterCasePermutation(String s) {
        LinkedList<String> result = new LinkedList<>();
        result.add(s);
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                int size = result.size();
                while (size-- > 0) {
                    String S = result.poll();
                    String left = S.substring(0, i);
                    String right = S.substring(i + 1, n);
                    result.add(left + Character.toLowerCase(c) + right);
                    result.add(left + Character.toUpperCase(c) + right);
                }
            }
        }
        return result;
    }
}