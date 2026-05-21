public class CircularQueue{
    int[] data;
    int capacity;
    int front;
    int rear;
    int size;
    
    public CircularQueue(int capacity){
        this.capacity=capacity;
        this.data=new int[capacity];
        this.front=0;
        this.rear=0;
        this.size=0;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return size==capacity;
    }

    public void enqueue(int val){
        if(isFull()){
            throw new RuntimeException("Queue is full");
        }
        data[rear]=val;
        rear=(rear+1)%capacity;
        size++;
    }

    public int dequeue(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        int removed=data[front];
        front=(front+1)%capacity;
        size--;
        return removed;
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        return data[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=0;i<size;i++){
            
            System.out.print(data[(front+i)%capacity]+" ");
        }
    }

    public void internalOp(){
        System.out.println("Display the array");
        for(int vals:data){
            System.out.print(vals+" ");
        }
        System.out.println();
        System.out.println("----------");
        System.out.println("rear "+rear);
        System.out.println("front "+front);
        System.out.println("size "+size);
        System.out.println("----------");
    }

    public static void main(String[] args) {
        CircularQueue cq=new CircularQueue(5);
        cq.enqueue(10);
        cq.enqueue(22);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        
        cq.display();
        cq.internalOp();

        cq.dequeue();
        cq.dequeue();

        cq.display();
        cq.internalOp();

        cq.enqueue(18);
        cq.display();
        cq.internalOp();

        
    }
}