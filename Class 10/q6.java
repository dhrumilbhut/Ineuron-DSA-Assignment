public class Assignment6 {
	static int steps;
	public static void main(String[] args) {
		towerOfHanoi(3, 1, 3, 2);
		System.out.println(steps);
	}
	
	public static void towerOfHanoi(int n,int from,int to,int aux) {
		if(n==1) {
			steps++;
			System.out.println("move disc 1 from rod "+from+" to rod "+to);
			return;
		}
		towerOfHanoi(n-1, from, aux, to);
		steps++;
		System.out.println("move disc "+n+" from rod "+from+" to rod "+to);
		towerOfHanoi(n-1, aux, to, from);
	}

}