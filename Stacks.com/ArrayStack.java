public class ArrayStack {
    int[] data;
    int top;

    public ArrayStack(int capacity) {
        data = new int[capacity];
        top = -1;
    }
    public boolean isEmpty() {
        return top ==-1;
    }
    public boolean isFull() {
        return top == data.length-1;
    }
    public void push(int value){
        if(isFull()){
            throw new RuntimeException("Stack is overflow");

        }
        data[++top]=value;
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is underflow");
        }
        return data[top];
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
        }
        return data[top--];
    }

    public int size(){
        return top+1;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("bottom---->top");
        for(int i=0;i<=top;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayStack stack=new ArrayStack(5);
        stack.push(56);
        stack.push(22);
        stack.push(88);
        stack.push(11);
        stack.display();
        System.out.println("Top element is: "+stack.peek());
        stack.pop();
        System.out.println("Top element is: "+stack.peek());
        System.out.println("Size: "+stack.size());
        System.out.println("Is stack empty? "+stack.isEmpty());
    }
}
