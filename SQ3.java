import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SQ3 {
    public static void main(String[] args) {
        Queue<String> customerQueue = new LinkedList<>();
        Stack<String> responseStack = new Stack<>();

        // Step 1: Customers arrive
        customerQueue.add("Alice");
        customerQueue.add("Bob");
        customerQueue.add("Charlie");

        System.out.println("Customer Queue: " + customerQueue);

        // Step 2: Serve customers and respond
        while (!customerQueue.isEmpty()) {
            String customer = customerQueue.poll(); // Get next customer
            String response = "Served customer: " + customer;
            responseStack.push(response);           // Track response
            System.out.println(response);
        }

        // Step 3: Undo last two responses
        System.out.println("\nUndoing last two responses:");
        for (int i = 0; i < 2 && !responseStack.isEmpty(); i++) {
            String undo = responseStack.pop();
            System.out.println("Undid: " + undo);
        }

        // Remaining response history
        System.out.println("\nRemaining responses:");
        while (!responseStack.isEmpty()) {
            System.out.println(responseStack.pop());
        }
    }
}
