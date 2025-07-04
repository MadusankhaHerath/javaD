import java.util.Stack;

public class stackpostfix {
    public static int evaluate(String expr) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expr.split(" ");

        for (String token : tokens) {
            if (token.matches("-?\\d+")) {
                // If token is a number, push to stack
                stack.push(Integer.parseInt(token));
            } else {
                // Operator: pop two elements
                int b = stack.pop();
                int a = stack.pop();
                int result = 0;

                switch (token) {
                    case "+" -> result = a + b;
                    case "-" -> result = a - b;
                    case "*" -> result = a * b;
                    case "/" -> result = a / b;
                    default -> throw new IllegalArgumentException("Unknown operator: " + token);
                }

                stack.push(result);
            }
        }

        return stack.pop(); // Final result
    }

    public static void main(String[] args) {
        String expression = "5 1 2 + 4 * + 3 -";
        int result = evaluate(expression);
        System.out.println("Result: " + result);  // Output: 14
    }
}
