public class trycatchex3{
    public static void main(String[] args) {
        trycatchex3 acc = new trycatchex3();

        try {
            acc.withdraw(200);
        } catch (insufficientfundexception e) {
            System.out.println("withdrawal faild : " +e.getMessage());
        }

        
    }

    class insufficientfundexception extends Exception{
        public insufficientfundexception(String message){
            super(message);
        }
    }

    private double balance = 1000;

    public void withdraw(double amount) throws insufficientfundexception{
        if(amount> balance){
            throw new insufficientfundexception("not enough balance to withdraw:"+ amount);
        }
        balance -= amount;
        System.out.println("balance :"+balance);
    }


}