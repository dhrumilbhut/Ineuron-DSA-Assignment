public class Assignment4 {
	
	public static void main(String[] args) {
		System.out.println(lengthOfString("abcde"));
	}
	
	public static int lengthOfString(String s)
    {
		if(s=="")
			return 0;
		return 1+lengthOfString(s.substring(1));
    }
}