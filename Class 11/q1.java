public class q1 {

	public static void main(String[] args) {
		System.out.println(squareroot(99));
	}

	public static int squareroot(int n) {
		int sqrt=0;
		int f=1;
		int l=n;
		int mid;
		while (f<=l) {
			mid=(f+l)/2;
			if(mid*mid==n)
				return mid;
			if(mid*mid<n) {
				f=mid+1;
				sqrt=mid;
			}
			else 
				l=mid-1;
		}
		return sqrt;
	}
}