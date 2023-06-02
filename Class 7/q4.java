/* Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

**Example 1:**

**Input:** s = "Let's take LeetCode contest"

**Output:** "s'teL ekat edoCteeL tsetnoc" */

public class q4 {
    public static void main(String[] args) {

        String s = "Let's take LeetCode contest";

        String ans = reverseWords(s);
        System.out.println(ans);
    }

    public static String reverseWords(String s) {        
        String x = "";        
        for(String t : s.split(" ")) 
            x += new StringBuilder(t).reverse().toString()+" ";
        return x.trim();
    }
}
