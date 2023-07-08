import java.util.Map;
import java.util.TreeMap;

class Node
{
    int key;
    Node left = null, right = null;
 
    Node(int key) {
        this.key = key;
    }
}
class Pair<U, V>
{
    public final U first;       
    public final V second;      
 
    private Pair(U first, V second)
    {
        this.first = first;
        this.second = second;
    }
 
    public static <U, V> Pair <U, V> of(U a, V b)
    {
        return new Pair<>(a, b);
    }
}
 
class Question4
{
    public static void printBottom(Node root, int dist, int level,
                                Map<Integer, Pair<Integer, Integer>> map)
    {
        if (root == null) {
            return;
        }
 
        if (!map.containsKey(dist) || level >= map.get(dist).second)
        {
            map.put(dist, Pair.of(root.key, level));
        }
 
        printBottom(root.left, dist - 1, level + 1, map);
 
        printBottom(root.right, dist + 1, level + 1, map);
    }
 
    public static void printBottom(Node root)
    {
 
        Map<Integer, Pair<Integer, Integer>> map = new TreeMap<>();
 
        printBottom(root, 0, 0, map);
 
        for (Pair<Integer, Integer> it: map.values()) {
            System.out.print(it.first + " ");
        }
    }
 
    public static void main(String[] args)
    {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.right = new Node(25);
         root.left.right.left = new Node(10);
          root.left.right.right = new Node(14);

       
        printBottom(root);
    }
}