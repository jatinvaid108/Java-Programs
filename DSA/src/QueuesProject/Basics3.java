package QueuesProject;
import java.util.Stack;

public class Basics3 {
    public static void main(String[] args) {
        System.out.println();
    }
}



class QueueUsingStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue operation (O(1))
    public void enqueue(int data) {
        stack1.push(data);
    }

    // Dequeue operation (O(n) in worst case)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Cannot dequeue.");
            return -1;
        }

        if (stack2.isEmpty()) {
            // Transfer all elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    // Peek front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot peek.");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        // Print all elements in queue order
        Stack<Integer> temp = new Stack<>();

        // Print stack2 in its current form (already reversed)
        for (int i = stack2.size() - 1; i >= 0; i--) {
            System.out.print(stack2.get(i) + " ");
        }

        // stack1 is in reverse, so store and print in order
        for (int i = 0; i < stack1.size(); i++) {
            temp.push(stack1.get(i));
        }

        while (!temp.isEmpty()) {
            System.out.print(temp.pop() + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();

        queue.dequeue();  // Underflow
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();  // 10 20 30

        System.out.println("Peek: " + queue.peek());  // 10
        System.out.println("Dequeued: " + queue.dequeue()); // 10
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();  // 20 30 40 50
    }
}
