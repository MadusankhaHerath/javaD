import java.util.Stack;

public class doubleSt {

    public static void main(String[] args) {
        // Create two stacks
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();

        // Push elements into the first stack
        stack1.push("A");
        stack1.push("B");
        stack1.push("C");

        System.out.println("Original Stack1: " + stack1);

        // Transfer elements from stack1 to stack2 (reverse order)
        while (!stack1.isEmpty()) {
            String item = stack1.pop();
            stack2.push(item);
        }

        System.out.println("Reversed in Stack2: " + stack2);

        // Pop from stack2 to show order is reversed
        System.out.print("Popped from Stack2: ");
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop() + " ");
        }
    }
}
