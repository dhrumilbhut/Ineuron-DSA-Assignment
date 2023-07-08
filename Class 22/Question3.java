import java.util.ArrayDeque;
import java.util.Deque;

class Node{
    int data;
    Node left = null, right = null;
 
    Node(int data) {
        this.data = data;
    }
}
 
class Question3{
    public static boolean isLeaf(Node node) {
        return (node.left == null && node.right == null);
    }
 
    public static void printRootToLeafPaths(Node node, Deque<Integer> path){
        if (node == null) {
            return;
        }
 
        path.addLast(node.data);
 
        if (isLeaf(node)) {
            System.out.println(path);
        }
 
        printRootToLeafPaths(node.left, path);
        printRootToLeafPaths(node.right, path);
 
        path.removeLast();
    }
 
    public static void printRootToLeafPaths(Node node){
        Deque<Integer> path = new ArrayDeque<>();
        printRootToLeafPaths(node, path);
    }
 
    public static void main(String[] args){
       
        Node root = new Node(6);
        root.left = new Node(3);
        root.right = new Node(5);
        root.left.left = new Node(2);
        root.left.right = new Node(5);
        root.right.right = new Node(4);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);
 
        printRootToLeafPaths(root);
    }
}