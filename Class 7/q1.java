import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 

Given two strings s and t, *determine if they are isomorphic*.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

**Example 1:**

**Input:** s = "egg", t = "add"

**Output:** true

 */
public class q1 {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        if(isIsomorphic(s, t)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        int n = s.length() - 1;
        
        while (n >= 0) {
            if (map.containsKey(s.charAt(n)) && map.get(s.charAt(n)) != t.charAt(n)) {
                return false;
            }
            if (!map.containsKey(s.charAt(n)) && set.contains(t.charAt(n))) {
                return false;
            }
            set.add(t.charAt(n));
            map.put(s.charAt(n), t.charAt(n));
            n--;
        }
        
        return true;
    }
}
