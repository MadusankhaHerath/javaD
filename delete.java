import java.util.Scanner;
public class delete{
    public static void main(String[] arg){
        Scanner scn = new Scanner (System.in);
        int[] arr = new int[10];
        int size = 5;

        for (int i=0;i<5;i++){
            System.out.print("enter number : ");
            arr[i] = scn.nextInt();
        }

        for (int j=0;j<5;j++){
            System.out.println(arr[j]);
        }

        System.out.print("enter the element : ");
        int ele = scn.nextInt();

       for(int k=ele;k<=size;k++){
        arr[k] = arr[k+1];
       }

       for(int i=0;i<size;i++){
        System.out.println(arr[i]);
       }

       size--;


    }
}