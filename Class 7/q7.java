/* 
Given two strings s and t, return true *if they are equal when both are typed into empty text editors*. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

**Example 1:**

**Input:** s = "ab#c", t = "ad#c"

**Output:** true

**Explanation:**

Both s and t become "ac".

. */

public class q7 {
    public static void main(String[] args) {

        String t = "ad#c";
        String s = "ab#c";

        if(backspaceCompare(s, t)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean backspaceCompare(String S, String T) {
        if (!getResStack(S).equals(getResStack(T))) 
          return false;
        else 
          return true;
    } 
    
    public static String getResStack(String s) {
        StringBuilder sb = new StringBuilder(); 
        
        for (char c : s.toCharArray()) {
            if (c == '#'){
                if (sb.length() > 0)
                    sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }  
        }
        
        return sb.toString();
    }}
