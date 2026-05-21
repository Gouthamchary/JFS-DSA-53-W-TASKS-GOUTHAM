import java.util.Stack;
public class QueuewithStack {
    Stack<Integer> input=new Stack<>();
    Stack<Integer> output=new Stack<>();

    public void enqueue(int value){
        input.push(value);
    }

    public int peek(){
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    public int dequeue(){
        peek();
        return output.pop();
    }

    public boolean isEmpty(){
        return input.isEmpty() && output.isEmpty();
    }

    public static void main(String[] args) {
        QueuewithStack qs1Stack=new QueuewithStack();
        qs1Stack.enqueue(15);
        qs1Stack.enqueue(30);
        qs1Stack.enqueue(45);
        qs1Stack.enqueue(60);

        System.out.println("Peek of the front element: "+qs1Stack.peek());
        System.out.println("Pop the element:"+qs1Stack.dequeue());
        System.out.println("Peek of the front element: "+qs1Stack.peek());
        System.out.println("Check if the queue is empty: "+qs1Stack.isEmpty());

    }

}
