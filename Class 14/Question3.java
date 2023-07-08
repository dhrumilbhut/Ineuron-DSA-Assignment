class Node
{
    int data;
    Node next;
    Node down;
}

public class Question3 {
    public static Node push(Node head, int data)
    {
        Node newNode = new Node();
 
        newNode.data = data;
        newNode.next = null;
        newNode.down = head;
 
        return newNode;
    }
 
    
    public static Node sortedMerge(Node a, Node b)
    {
        if (a == null) {
            return b;
        }
        else if (b == null) {
            return a;
        }
 
        Node result;
 
        if (a.data <= b.data)
        {
            result = a;
            result.down = sortedMerge(a.down, b);
        }
        else {
            result = b;
            result.down = sortedMerge(a, b.down);
        }
 
        return result;
    }
 
    
 
    public static Node[] frontBackSplit(Node source)
    {
        if (source == null || source.down == null) {
            return new Node[]{ source, null };
        }
 
        Node slow = source;
        Node fast = source.down;
 
        while (fast != null)
        {
            fast = fast.down;
            if (fast != null)
            {
                slow = slow.down;
                fast = fast.down;
            }
        }
 
      
        Node[] arr = new Node[]{ source, slow.down };
        slow.down = null;
 
        return arr;
    }
 
    public static Node mergesort(Node head)
    {
        if (head == null || head.down == null) {
            return head;
        }
 
        Node[] arr = frontBackSplit(head);
        Node front = arr[0];
        Node back = arr[1];
 
        front = mergesort(front);
        back = mergesort(back);
 
        return sortedMerge(front, back);
    }
 
    public static void printList(Node head)
    {
        Node ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.down;
        }
 
        System.out.println("null");
    }
 
    public static void flatten (Node head)
    {
        Node curr = head;
 
        while (curr != null)
        {
            Node temp = curr;
            while (temp.down != null) {
                temp = temp.down;
            }
            temp.down = curr.next;
            curr = curr.next;
        }
    }
 
    public static Node createVerticalList(Node head, int[] arr)
    {
        for (int key: arr) {
            head = push(head, key);
        }
        return head;
    }
 
    public static void main(String[] args)
    {
        Node head = null;
 
        int[] arr1 = { 5, 10, 19, 28 };
        int[] arr2 = { 7, 20 ,22, 35};
        int[] arr3 = { 8, 50, 40 };
        int[] arr4 = { 30, 45};
 
        head = createVerticalList(head, arr1);
        head.next = createVerticalList(head.next, arr2);
        head.next.next = createVerticalList(head.next.next, arr3);
        head.next.next.next = createVerticalList(head.next.next.next, arr4);
 
        flatten(head);
 
        mergesort(head);
 
        printList(head);
    }
}
