import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Node
{
    int data;
    Node next;
 
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
 
class Question1
{
    public static void printList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.data + ",");
            node = node.next;
        }
    }
 
   
    public static Node mergeKLists(Node[] lists)
    {
        PriorityQueue<Node> pq;
        pq = new PriorityQueue<>(Comparator.comparingInt(a -> ((Node) a).data));
 
        pq.addAll(Arrays.asList(lists).subList(0, lists.length));
 
        
        Node head = null, last = null;
 
        while (!pq.isEmpty())
        {
            Node min = pq.poll();
 
            if (head == null) {
                head = last = min;
            }
            else {
                last.next = min;
                last = min;
            }
 
            if (min.next != null) {
                pq.add(min.next);
            }
        }
 
        return head;
    }
 
    public static void main(String[] s)
    {
        int k = 3;    
 
        Node[] lists = new Node[k];
 
        lists[0] = new Node(1);
        lists[0].next = new Node(4);
        lists[0].next.next = new Node(5);
 
        lists[1] = new Node(1);
        lists[1].next = new Node(3);
        lists[1].next.next = new Node(4);
 
        lists[2] = new Node(2);
        lists[2].next = new Node(6);
 
        Node head = mergeKLists(lists);
        printList(head);
    }
}
