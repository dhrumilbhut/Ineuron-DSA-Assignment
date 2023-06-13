public class Assignment8 {

	public static void main(String[] args) {
		System.out.println(getConsonanats("geeksforgeeks portal"));
	}
	
	public static int getConsonanats(String s) {
		int consonants=0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u'&&c!=' ') {
				consonants++;
			}
		}
		return consonants;
	}
}