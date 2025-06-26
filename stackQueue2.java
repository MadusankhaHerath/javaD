import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stackQueue2 {
    public static void main(String[] args) {
        String word = "madam";
        boolean isPalindrome = true;

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Add characters to stack and queue
        for (char ch : word.toCharArray()) {
            stack.push(ch);
            queue.add(ch);
        }

        // Compare stack and queue characters
        while (!stack.isEmpty()) {
            char fromStack = stack.pop();    // Last in
            char fromQueue = queue.poll();   // First in

            if (fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is NOT a palindrome.");
        }
    }
}
