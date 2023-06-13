import java.util.HashSet;

public class Assignment5 {
	public static void main(String[] args) {
		String s="abcab";
		int count = getSubstrings(0, s, new HashSet<Character>(), 0);
		System.out.println(count);
	}

	public static int getSubstrings(int idx,String s,HashSet<Character> set,int count) {
		if (idx==s.length()) {
			return count;
		}
		if (set.contains(s.charAt(idx))) {
			count+=2;
		}
		else {
			set.add(s.charAt(idx));
			count++;
		}
		return getSubstrings(++idx, s, set, count);
	}

}