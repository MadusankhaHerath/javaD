
import java.util.Scanner;



public class reverseString{
    private char[] wordStack;
    private int maxSize;
    private int top;

    public reverseString(int size) {
        maxSize = size;
        wordStack = new char[maxSize];
        top = -1;
    }

    public void push(char c) {
        if (!isFull()) {
            wordStack[++top] = c;
        }
    }

    public char pop() {
        if (!isEmpty()) {
            return wordStack[top--];
        }
        return '\0';
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }




    public static String reverse(String input){
        StringBuilder result = new StringBuilder();
        reverseString e = new reverseString(input.length());

        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);

            if (c != ' '){
                e.push(c);
            }
            else{
                while(!e.isEmpty()){
                    result.append(e.pop());
                }
                result.append(' ');
            }
        }

        while(!e.isEmpty()){
            result.append(e.pop());
        }
        
        return result.toString();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentense : ");
        String input = sc.nextLine();

        String re = reverse(input);
        System.out.println("reversed String : " + re);
    }
    
}