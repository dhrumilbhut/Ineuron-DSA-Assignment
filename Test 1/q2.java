import java.util.HashMap;


public class q2 {
    public static void main(String[] args) {
        String s = "loveleetcode";
        int ans = firstUniqChar(s);
        System.out.println(ans);
    }

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);

        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}
