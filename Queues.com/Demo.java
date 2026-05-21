import java.util.ArrayDeque;
import java.util.Queue;

public class Demo {
    public static void main(String[] args){
        Queue<Integer> q=new ArrayDeque<>();

        System.out.println("Enqueue the elements:");
        q.offer(45);
        q.offer(74);
        q.offer(19);
        q.offer(37);
        q.offer(90);
        

        System.out.println("Peek the front element: "+q.peek());
        System.out.println("Remove the elements:"+q.poll());
        System.out.println("Peek the elements: "+q.peek());
        System.out.println("size of the queue: "+q.size());
        System.out.println("Check if the queue is empty: "+q.isEmpty());
    }
}
