package Day29;

import java.util.*;
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }

    public Node(int val) {
        this.val = val;
        neighbors = new ArrayList<>();
    }

    public Node(int val, List<Node> neighbors) {
        this.val = val;
        this.neighbors = neighbors;
    }
}

public class Prob4 {

    static class Solution {

        Map<Node, Node> map = new HashMap<>();

        public Node cloneGraph(Node node) {
            if (node == null)
                return null;

            if (map.containsKey(node))
                return map.get(node);

            Node copy = new Node(node.val);
            map.put(node, copy);

            for (Node n : node.neighbors)
                copy.neighbors.add(cloneGraph(n));

            return copy;
        }
    }

    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n1.neighbors.add(n2);
        n1.neighbors.add(n4);
        n2.neighbors.add(n1);
        n2.neighbors.add(n3);
        n3.neighbors.add(n2);
        n3.neighbors.add(n4);
        n4.neighbors.add(n1);
        n4.neighbors.add(n3);

        Solution s = new Solution();
        Node clone = s.cloneGraph(n1);

        System.out.println("Cloned Node Value: " + clone.val);
    }
}