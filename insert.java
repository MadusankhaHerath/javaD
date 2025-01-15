import java.util.Scanner;
public class insert{
    public static void main (String Arg[]){
        Scanner scan = new Scanner (System.in);
        int [] arr = new int[10];
        int size =5;

        for (int x=0;x<size;x++){
            System.out.print("enter number : ");
            arr[x] = scan.nextInt();
        }

        for(int y=0;y<size;y++){
            System.out.println(arr[y]);
        }

        System.out.print("enter the element : ");
        int ele = scan.nextInt();

        System.out.print("enter the index : ");
        int ind = scan.nextInt();

        size++;

        for (int i=size;i>=ele;i--){
            arr[i] = arr[i-1];

        }
        arr[ele] = ind;

        for(int j=0;j<size;j++){
            System.out.println(arr[j]);
        }

    }
}

