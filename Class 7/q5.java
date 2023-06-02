/* Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

**Example 1:**

**Input:** s = "abcdefg", k = 2

**Output:**

"bacdfeg" */

public class q5 {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k=2;

        String ans = reverseStr(s, k);
        System.out.println(ans);
    }

    public static String reverseStr(String s, int k) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i += 2*k) {
            int j = Math.min(i + k, n);
            StringBuilder rev = new StringBuilder(s.substring(i, j));
            rev.reverse();
            sb.append(rev);
            int rem = Math.min(i + 2*k, n);
            sb.append(s.substring(j, rem));
        }
        return sb.toString();
    }
}
