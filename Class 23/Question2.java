import java.util.ArrayDeque;
import java.util.Queue;

class Node
{
    int key;
    Node left = null, right = null;
 
    Node(int key) {
        this.key = key;
    }
}

public class Question2 {
    public static void leftView(Node root)
    {
        if (root == null) {
            return;
        }
 
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
 
        Node curr;
 
        while (!queue.isEmpty())
        {
            int size = queue.size();
            int i = 0;
 
            while (i++ < size)
            {
                curr = queue.poll();
 
                if (i == 1) {
                    System.out.print(curr.key + " ");
                }
 
                if (curr.left != null) {
                    queue.add(curr.left);
                }
 
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }
    }
 
    public static void main(String[] args)
    {
        Node root = new Node(4);
        root.left = new Node(5);
        root.right = new Node(2);
        root.right.left = new Node(3);
        root.right.right = new Node(1);
        root.right.left.left = new Node(6);
        root.right.left.right = new Node(7);
 
        leftView(root);
    }
}

