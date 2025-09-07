import java.util.Scanner;
import java.util.Stack;

public class ReverseStack{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String s = sc.nextLine();

        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            st.push(c);
        }
        
        StringBuilder reverse = new StringBuilder();
        while(!st.isEmpty()){
            reverse.append(st.pop());
        }
        System.out.println(reverse);

    }    


    
}