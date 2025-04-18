
import java.util.Scanner;



public class queuexmain{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        queuex printerQueue = new queuex(5);

        for(int i=1 ; i<=5 ; i++){
            System.out.print("Enter Transaction ID " +i + " = ");
            int ID = scn.nextInt();
            printerQueue.insert(ID);
        }

        queuex evenQueue = new queuex(5);
        queuex oddQueue = new queuex(5);

        while(!printerQueue.isempty()){
            int transaction = printerQueue.remove();
            if(transaction % 2 == 0){
                evenQueue.insert(transaction);
            }
            else{
                oddQueue.insert(transaction);
            }
        }

        System.out.println("PS1");
        while(!evenQueue.isempty()){
            System.err.println("Transaction" +evenQueue.remove());
        }

        System.out.println("PS2");
        while(!oddQueue.isempty()){
            System.err.println("Transaction = " +oddQueue.remove());
        }
    }
}