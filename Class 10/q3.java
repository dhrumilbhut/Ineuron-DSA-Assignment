public class Assignment3 {

	public static void main(String[] args) {
		String s = "abcd";
		findSubet(s, 0, s.length(),"");
	}

	public static void findSubet(String s, int l, int r,String ans) {
		if (l == r) {
			System.out.print("\""+ans+"\"  ");
			return;
		}
		findSubet(s, l + 1, r,ans+s.charAt(l));
		findSubet(s, l + 1, r,ans);
	}
}