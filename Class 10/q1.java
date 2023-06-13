public class Assignment1 {

	public static void main(String[] args) {
		System.out.println(powerOf3(9));
	}

	public static boolean powerOf3(int n) {
		if (n == 1)
			return true;
		if (n % 3 != 0 || n <= 0)
			return false;
		else
			return powerOf3(n / 3);
	}
}
