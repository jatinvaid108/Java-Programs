package QueuesProject;

public class Basics2 {
    public static void main(String[] args) {
        System.out.println();
    }
}

class queueArray {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public queueArray(int capacity){
        this.capacity=capacity;
        this.queue=new int[capacity];
        this.front=0;
        this.rear=-1;
        this.size=0;
    }

    public void enqueue(int x){
        if(isFull()){
            System.out.println("Queue Overflowed: Cannot enqueue "+ x);
            return;
        }
        rear=(rear+1)%capacity;     //Circular increment
        queue[rear]=x;
        size++;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue Underflow: Cannot Dequeue ");
            return -1;
        }
        int removed=queue[front];
        front=(front+1)%capacity;    //Circular Increment of front
        size--;
        return removed;
    }

    public int peek(){
        if(!isEmpty()){
            return queue[front];
        }
        else return -1;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return size==capacity;
    }

    public int size(){
        return size;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return;
        }
        for(int i=0;i<size;i++){
            int index = (front + i) % capacity; // wrap around circularly
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        queueArray queue=new queueArray(5);

        queue.dequeue();  // Underflow
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();  // 10 20 30 40 50

        queue.enqueue(60); // Overflow

        System.out.println("Front: " + queue.peek()); // 10
        System.out.println("Dequeued: " + queue.dequeue()); // 10
        queue.enqueue(60); // This should now work due to circular queue
        queue.display();  // 20 30 40 50 60
    }
}


class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
class QueueLinkedList{
    private Node front;
    private Node rear;
    private int size;

    public QueueLinkedList(){  //Constructor
        this.front=null;
        this.rear=null;
        this.size=0;
    }

    public void enqueue(int val){
        Node newNode=new Node(val);
        if(isEmpty()){
            front=rear=newNode;
        }
        else{
            rear.next=newNode;
            rear=newNode;
        }
        size++;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue Underflow! Cannot dequeue.");
            return -1;
        }
        int removed=front.data;
        front=front.next;
        if(front==null) rear=null;  //if queue becomes empty
        size--;
        return removed;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue Underflow! Cannot peek.");
            return -1;
        }
        return front.data;
    }
    public boolean isEmpty(){
        return front==null;
    }

    public int size(){
        return size;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue Underflow! Cannot dequeue.");
            return ;
        }

        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QueueLinkedList queue=new QueueLinkedList();

        queue.dequeue(); // Underflow
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display(); // 10 20 30 40 50

        System.out.println("Peek: " + queue.peek()); // 10
        System.out.println("Dequeued: " + queue.dequeue()); // 10
        queue.display(); // 20 30 40 50

        System.out.println("Size: " + queue.size()); // 4

        // Dequeue all to test underflow again
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue(); // Underflow again
    }

}

