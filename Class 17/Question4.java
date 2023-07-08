import java.util.LinkedList;
import java.util.Queue;
public class Question4 {

    
    Queue<Integer> queue;

    private Question4() {
        queue = new LinkedList<Integer>();
    }
    
    public  int ping(int t) {
        queue.offer(t);
        int time = t - queue.peek();
        while(time > 3000) {
            queue.poll();
            time = t - queue.peek();
        }
        return queue.size();
    }
    
}
