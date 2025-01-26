import java.util.Scanner;
public class update{
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


        System.out.print("Enter index to update : ");
        int ind = scn.nextInt();

         System.out.print("Enter new element : ");
        int ele = scn.nextInt();

        arr[ind] = ele;

        for (int j=0;j<5;j++){
            System.out.println(arr[j]);
        }

        
    }


}