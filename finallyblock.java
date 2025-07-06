public class finallyblock {
    public static void main(String[] args) {
        try {
            int a = 10 / 0; // Will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e);
        } finally {
            System.out.println("This runs no matter what.");
            //code that always run
        }
    }
}
