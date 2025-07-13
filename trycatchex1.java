// Custom Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class trycatchex1 {
    public static void main(String[] args) {
        int balance = 5000;

        try {
            int amountToWithdraw = 6000;

            // Check for sufficient balance
            if (amountToWithdraw > balance) {
                throw new InsufficientFundsException("Insufficient funds for withdrawal.");
            }

            // Simulate transaction
            balance -= amountToWithdraw;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);

            // Simulate logging the transaction (with a nested try-catch)
            try {
                String log = null;
                System.out.println(log.length()); // NullPointerException
            } catch (NullPointerException e) {
                System.out.println("Transaction logged failed: " + e);
            }

        } catch (InsufficientFundsException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e);
        } finally {
            System.out.println("Transaction attempt complete. Please check your account.");
        }

        System.out.println("System ready for next transaction.");
    }
}
