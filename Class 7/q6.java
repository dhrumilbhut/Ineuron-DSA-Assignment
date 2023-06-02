

/* 
 
    Given two strings s and goal, return true *if and only if* s *can become* goal *after some number of **shifts** on* s.

A **shift** on s consists of moving the leftmost character of s to the rightmost position.

- For example, if s = "abcde", then it will be "bcdea" after one shift.

**Example 1:**

**Input:** s = "abcde", goal = "cdeab"

**Output:**

true

 */

public class q6 {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        if(rotateString(s, goal)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    public static boolean rotateString(String s, String goal) {
        return (s.length()==goal.length() && (s+s).contains(goal)); 
     }
}