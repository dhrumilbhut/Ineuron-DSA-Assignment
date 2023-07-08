class Node
{
    int data;
    Node next;
 
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}
 

public class Question5 {
    public static void printList(Node head)
    {
        Node ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }
 
        System.out.println("null");
    }
 

    public static Node rearrangeEvenOdd(Node head)
    {
        Node odd = null, oddTail = null;
        Node even = null, evenTail = null;
        Node curr = head;
 
        while (curr != null)
        {
            if ((curr.data & 1) != 0)        
            {
                if (odd == null) {
                    odd = oddTail = curr;
                }
                else {
                    oddTail.next = curr;
                    oddTail = oddTail.next;
                }
            }
            else    
            {
                if (even == null) {
                    even = evenTail = curr;
                }
                else {
                    evenTail.next = curr;
                    evenTail = curr;
                }
            }
            curr = curr.next;
        }
 
        if (even != null)
        {
            head = even;
            evenTail.next = odd;
        }
        else {
            head = odd;
        }
 
        if (oddTail != null) {
            oddTail.next = null;
        }
 
        return head;
    }
 
    public static void main(String[] args)
    {
        int[] keys = { 1, 2, 3, 4, 5 };
 
        Node head = null;
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }
 
        head = rearrangeEvenOdd(head);
        printList(head);
    }
}
