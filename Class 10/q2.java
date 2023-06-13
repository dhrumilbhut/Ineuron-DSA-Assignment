import java.util.ArrayList;
import java.util.List;

public class Assignment2 {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <2; i++) {
			list.add(i);
		}
		int number = findNumber(list, 1);
		System.out.println(number);
		
	}
	
	public static int findNumber(List<Integer> list,int k) {
		if(list.size()==1)
			return list.get(0);
		if (k==1) {
			for (int i = 0; i < list.size(); i++) 
				list.remove(i);
		}
		if (k==-1) {
			for (int i = list.size()-1; i >=0; i-=2) 
				list.remove(i);
		}
		
		return findNumber(list, -k);
	}
}