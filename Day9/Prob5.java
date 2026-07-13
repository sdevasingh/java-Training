public class Prob5 {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);

        while (head != null) {
            if (head.data == 20)
                System.out.println("Found");
            head = head.next;
        }
    }
}                           