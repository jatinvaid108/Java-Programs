package Stacks;
import java.util.LinkedList;
import java.util.Queue;

public class basics5 {
    public static void main(String[] args) {
        System.out.println();
    }
}



class StackUsingQueues {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public StackUsingQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // Push element onto stack
    public void push(int x) {
        // Step 1: Enqueue to q2
        q2.offer(x);

        // Step 2: Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        // Step 3: Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Removes the element on top of the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return q1.poll();
    }

    // Get the top element
    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return q1.peek();
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    // Return size of stack
    public int size() {
        return q1.size();
    }

    // Display all elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }

        for (int val : q1) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();
        stack.pop(); // Underflow
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // 30 20 10

        System.out.println("Top: " + stack.top()); // 30
        System.out.println("Popped: " + stack.pop()); // 30
        stack.display(); // 20 10
    }
}
