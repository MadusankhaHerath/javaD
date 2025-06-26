import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stackQueue{
    public static void main(String[] args) {
        // Initialize a stack and a queue
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        // Sample elements
        String[] elements = {"A", "B", "C", "D"};

        // Add elements to both stack and queue
        for (String element : elements) {
            stack.push(element);  // LIFO
            queue.add(element);   // FIFO
        }

        // Display original structures
        System.out.println("Original Stack (LIFO): " + stack);
        System.out.println("Original Queue (FIFO): " + queue);

        // Remove elements from stack
        System.out.print("Stack popping order: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        System.out.println();

        // Remove elements from queue
        System.out.print("Queue polling order: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }

        System.out.println();
    }
}
