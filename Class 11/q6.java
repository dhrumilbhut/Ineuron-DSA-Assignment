public class q6 {
	static int steps;
	public static void main(String[] args) {
		int[] arr =new int[] {7,0,1,2,3,4,5,6};
		System.out.println(minimumElement(arr));
	}
	
	public static int minimumElement(int[] arr) {
		int f=0;
		int l=arr.length-1;
		int mid;
		while (f<=l) {
			mid=(f+l)/2;
			if(arr[mid]<arr[mid-1])
				return arr[mid];
			if(arr[mid]<arr[l])
				l=mid-1;
			else
				f=mid+1;
		}
		return -1;
	}

}