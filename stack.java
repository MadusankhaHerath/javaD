
class stack{
    int arr[];
    int top;
    int capacity;

    stack(int size){
        arr = new int[size];
        top = -1;
        capacity = size;

    }

    boolean isfull(){
        return top + 1 == capacity;
    }
    boolean isempty(){
        return top == -1;
    }

    void push(int x){
        if(isfull()){
            System.out.println("stack is full");
        }
        else {
            top++;
            arr[top] = x;
            System.out.println("Inserting : " + x);
        }

    }

    void pop (){
        if(isempty()){
            System.out.println("stack is empty");
        }
        else{
           
            System.out.println("removing : " + arr[top]);
             top--;
        }
    }

    void peek(){
        if(top==-1){
            System.out.println("stack is empty..!");

        }
        else {
            System.out.println("top is : " +arr[top]);
        }
    }

    public static void main(String[] args) {
        stack mys = new stack(4);

        mys.push(10);
        mys.push(20);
        mys.push(30);
        mys.push(40);
        System.out.println("");
        

        mys.pop();
        mys.pop();
        mys.pop();
        System.out.println("");


        mys.peek();
    }

}