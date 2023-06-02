

/* 

Given a string num which represents an integer, return true *if* num *is a **strobogrammatic number***.

A **strobogrammatic number** is a number that looks the same when rotated 180 degrees (looked at upside down).

**Example 1:**

**Input:** num = "69"

**Output:**

true

 */

 public class q2 {
    public static void main(String[] args) {
        String num="69";
        if(isStrobogrammatic(num)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean isStrobogrammatic(String num) {
        for (int i=0, j=num.length()-1; i <= j; i++, j--)
            if (!"00 11 88 696".contains(num.charAt(i) + "" + num.charAt(j)))
                return false;
        return true;
    }
    
}
