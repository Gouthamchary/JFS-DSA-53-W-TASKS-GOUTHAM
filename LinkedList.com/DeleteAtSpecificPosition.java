public class DeleteAtSpecificPosition {
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

    public void deleteAtPosition(int position) {
        if (head == null) {
            return;
        }

        Node temp = head;

        if (position == 0) {
            head = temp.next; // Change head
            return;
        }

        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            return;
        }

        Node next = temp.next.next;
        temp.next = next; // Unlink the node to be deleted
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    public static void main(String[] args) {
        DeleteAtSpecificPosition list = new DeleteAtSpecificPosition();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);

        System.out.println("Linked List before deletion:");
        list.printList();

        int positionToDelete = 2; // Position starts from 0
        list.deleteAtPosition(positionToDelete);

        System.out.println("\nLinked List after deletion at position " + positionToDelete + ":");
        list.printList();
    }
}
