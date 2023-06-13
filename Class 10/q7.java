public class Assignment7 {

	public static void main(String[] args) {
		String s= "ABC";
		combination(s, "");
	}
	
	public static void combination(String s,String ans) {
		if (s.length()==0) {
			System.out.println(ans+" ");
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			String remainString=s.substring(0,i)+s.substring(i+1);
			
			combination(remainString, ans+c);
		}
		
	}
	

}