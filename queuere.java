
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class queuere{
    public static void main(String[] arg){
        Scanner scn = new Scanner(System.in);
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        //user inputs to assending order
        System.out.print("enter the charactors i assending order(no space) =");
        String input = scn.nextLine();

        //enqueue charactors
        for(char x :input.toCharArray()){
            queue.add(x);
        }

        //move to stack
        while(!queue.isEmpty()){
            stack.push(queue.remove());
        }

        //move back to Queue
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }

        System.out.println("desending order");
        while(!queue.isEmpty()){
            System.out.print(queue.remove() + " ");
        }
        scn.close();

    }
}