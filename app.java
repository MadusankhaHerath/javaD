public class app{
    char arr[];
    int top;
    int capacity;

    app(int size){
        arr = new char[size];
        top =-1;
        capacity = size;
    }

    boolean isempty(){
        return top == -1;
    }

    boolean isfull(){
        return top + 1 == capacity;
    }

    public void push(char x){
        if(isfull()){
            System.out.println("stack is full");
        }
        else{
            top++;
            arr[top] = x;
            System.out.println("inserting = " + x);
        }
    }

    public void pop(){
        if(isempty()){
            System.out.println("stack is empty");
        }
        else{
            System.out.println("removing = " +arr[top]);
            top--;
        }
    }

    public void peek(){
        if(isempty()){
            System.out.println("stack is empty");
        }
        else{
            System.out.println(arr[top]);
        }
    }

public static void main(String[] args) {
    app a1 = new app(5);

    a1.push('A');
    a1.push('B');
    a1.push('C');
    a1.push('D');

    a1.pop();
    a1.peek();

}

}