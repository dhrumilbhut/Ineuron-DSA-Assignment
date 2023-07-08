import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Question6 {
     private static int[] deckRevealedIncreasing(int[] deck) {
        int N=deck.length, j=0;
        int[] res = new int[N];
        Deque<Integer> dq = new LinkedList();
        Arrays.sort(deck);
        dq.add(deck[N-1]);
        for (int i = N-2; i >= 0; i--){
            dq.addFirst(dq.pollLast());
            dq.addFirst(deck[i]);
        }
            
        while(!dq.isEmpty()) {
            int value = dq.pollFirst();
            res[j]=value;
            j++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] deck = {17,13,11,2,3,5,7} ;
        int[] ans = deckRevealedIncreasing(deck);
        System.out.println(Arrays.toString(ans));
    }
}
