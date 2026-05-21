public class StackOperations{
    public static int push(int[] stack, int top, int element) {
        if (top < stack.length - 1) {
            stack[++top] = element;
            return top;
        } else {
            System.out.println("Stack is full. Cannot push " + element);
        }
        return top;
    }

    public static int pop(int[] stack, int top) {
        if (top >= 0) {
            return stack[top--];
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return -1 to indicate stack is empty
        }
    }

    public static int peek(int[] stack, int top) {
        if (top >= 0) {
            return stack[top];
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return -1 to indicate stack is empty
        }
    }

    public static boolean isEmpty(int top) {
        return top == -1;
    }

    public static boolean isFull(int top, int capacity) {
        return top == capacity - 1;
    }
    public static int getMin(int[] stack, int top) {
        if (top >= 0) {
            int min = stack[0];
            for (int i = 1; i <= top; i++) {
                if (stack[i] < min) {
                    min = stack[i];
                }
            }
            return min;
        } else {
            System.out.println("Stack is empty. Cannot get minimum.");
            return -1; // Return -1 to indicate stack is empty
        }
    }

    public static void main(String[] args) {
        int capacity = 5;
        int[] stack = new int[capacity];
        int top = -1;

        top = push(stack, top, 10);
        top = push(stack, top, 20);
        top = push(stack, top, 2);
        top = push(stack, top, 15);
        top = push(stack, top, 3);

        System.out.println("Top element: " + peek(stack, top));
        System.out.println("Minimum element: " + getMin(stack, top));

        System.out.println("Popped element: " + pop(stack, top));
        System.out.println("Top element after pop: " + peek(stack, top));
    }
}
