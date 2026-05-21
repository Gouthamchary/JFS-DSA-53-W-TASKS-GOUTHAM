//Give me entire code for CircularLinkedList.java with simple implementation of circular linked list in java
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    private Node head;

    public CircularLinkedList() {
        this.head = null;
    }

    // Method to add a node to the circular linked list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head; // Point to itself to make it circular
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode; // Point the last node to the new node
            newNode.next = head; // Point the new node back to head
        }
    }

    // Method to display the circular linked list
    public void display() {
        if (head == null) {
            System.out.println("Circular Linked List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList circularList = new CircularLinkedList();
        circularList.add(10);
        circularList.add(20);
        circularList.add(30);
        circularList.add(40);

        System.out.println("Circular Linked List:");
        circularList.display();
    }
}