import java.util.Stack;

public class GetMin {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> minStack=new Stack<>();

    public void push(int x) {
        stack.push(x);
        if(minStack.isEmpty() || x <= minStack.peek()){
            minStack.push(x);
        }
    }

    public void pop(){
        if(stack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        stack.pop();
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return minStack.peek();
    }

    public static void main(String[] args) {
        GetMin gm= new GetMin();
        gm.push(5);
        gm.push(-3);
        gm.push(0);
        gm.push(-2);
        gm.push(4);

        System.out.println("Top Element : "+gm.top());
        System.out.println("Minimum Element : "+gm.getMin());
        gm.pop();
        System.out.println("Top Element : "+gm.top());
        System.out.println("Minimum Element : "+gm.getMin());
        
    }
}
