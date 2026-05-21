public class LinkedDeleteBegin {
    Node head;
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }


    public static void main(String[] args) {
        LinkedBegin llist = new LinkedBegin();
        llist.push(1);
        llist.push(2);
        llist.push(3);
        llist.push(4);
        llist.push(5);

        System.out.println("Linked List before deletion:");
        llist.printList();

        llist.head = llist.head.next;

        System.out.println("\nLinked List after deletion of the first node:");
        llist.printList();
    }
}
