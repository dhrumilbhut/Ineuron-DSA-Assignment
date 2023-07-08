
import java.util.LinkedList;
import java.util.Queue;
public class Question3 {
	
	static class Node {
		int data;
		Node left, right, nextRight;
		Node(int data){
			this.data = data;
			left = null;
			right = null;
			nextRight = null;
		}
	};
	
	static void connect(Node root)
	{
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
	
		q.add(null);
	
		while (!q.isEmpty()) {
			Node p = q.peek();
			q.remove();
			if (p != null) {
	
				
				p.nextRight = q.peek();
	
			
				if (p.left != null)
					q.add(p.left);
				if (p.right != null)
					q.add(p.right);
			}
			
		
			else if (!q.isEmpty())
				q.add(null);
		}
	}
	
	public static void main(String args[])
	{
	
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.right = new Node(5);
        root.left.left.left = new Node(6);
        root.right.right.right.right = new Node(7);
	
		connect(root);
	
		
		System.out.println(root.data+((root.nextRight != null) ? root.nextRight.data : -1));
		System.out.println( root.left.data+((root.left.nextRight != null) ? root.left.nextRight.data : -1));
		System.out.println(root.right.data+((root.right.nextRight != null) ? root.right.nextRight.data : -1));
		System.out.println( root.left.left.data+((root.left.left.nextRight != null) ? root.left.left.nextRight.data : -1));
		System.out.println( root.right.right.data+((root.right.right.nextRight != null) ? root.right.right.nextRight.data : -1));
		System.out.println( root.left.left.left.data+((root.left.left.left.nextRight != null) ? root.left.left.left.nextRight.data : -1));
		System.out.println( root.right.right.right.data+((root.right.right.right.nextRight != null) ? root.right.right.right.nextRight.data : -1));


	}
}
