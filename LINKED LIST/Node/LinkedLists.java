package Node;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {
        System.out.println("hello this is a first code for linked list-->");
        // System.out.println(data);
        // System.out.println(next);
        Node p1 = new Node(10);
        Node p2 = new Node(20);

        System.out.println(p1.next);
        System.out.println(p1.data);

        System.out.println(p2.data);
        System.out.println(p2.next);
    }
}