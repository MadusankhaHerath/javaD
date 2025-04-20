public class stack1{
    char arr[];
    int top;
    int capacity;

    stack1(int size){
        top = -1;
        capacity = size;
        arr = new char[size];
    }

    public boolean isempty(){
        return top == -1;
    }

    public boolean isfull(){
        return top + 1 == capacity;
    }

    public void push(char x){
        if(isfull()){
            System.out.println("stack is full");
        }
        else{
            top++;
            arr[top] = x;
        }
    }

    public char pop(){
        if(isempty()){
            System.out.println("stack is empty");
            return 0;
        }
        else{
            char val = arr[top];
            top--;
            return val;
        }
    }

    public void display() {
        for (int i = 0; i <=top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}