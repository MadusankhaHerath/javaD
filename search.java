import java.util.Scanner;
public class search{
    public static void main(String[] arg){
        Scanner scn = new Scanner (System.in);
        int[] arr = new int[5];

        System.out.println("");
        System.out.println("Array input");

        for(int i=0;i<5;i++){
            System.out.print("number : ");
            arr[i] = scn.nextInt();
        }

        System.out.println("output");

        for (int j=0;j<5;j++){
            System.out.println(arr[j]);
        }


        System.out.println("Enter number for search");
        int data = scn.nextInt();

        int k;
        boolean found = false;

        for (k=0;k<5;k++){
            if(arr[k] == data){
                System.out.println(k);
                found = true;
                
            }
            
        }

        if(!found){
            System.out.println("number not found");
        }
        


    }


}