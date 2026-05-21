public class LinkedListStack {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node top;
    public int size;
    public LinkedListStack() {
        top = null;
        size = 0;
    }
    public boolean isEmpty() {
        return top == null;
    }
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is overflow");
        }
        return top.data;
    }
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is underflow");
        }
        int value = top.data;
        top = top.next;
        size--;
        return value;
    }
    public int size() {
        return size;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("top---->bottom");
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(56);
        stack.push(22);
        stack.push(88);
        stack.push(11);
        stack.display();
        System.out.println("Top element is: " + stack.peek());
        stack.pop();
        stack.display();
    }
}

