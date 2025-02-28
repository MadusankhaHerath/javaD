public class queue{
    
    int front;
    int rear;
    int capacity;

    int arr[];

    public queue(int size){
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;

    }

    boolean isfull(){
        return rear + 1 == capacity;
    }

    boolean isempty(){
        return rear<front;
    }

    void enqueue(int x){
        if(isfull()){
            System.out.println("queue is full");
        }
        else{
            rear++;
            arr[rear] = x;
            System.out.println("entering : "+x);
        }

    }

    void dequeue(){
        if(isempty()){
            System.out.println("no data to remove");
        }
        else{
            System.out.println("removing : " + arr[front]);
            front++;
        }
    }

    void printq(){
        for(int i=front;i<=rear;i++){
            System.out.print(arr[front] + "  ");
        }
    }

    public static void main(String[] args) {
        queue newq = new queue(3);

        newq.enqueue(10);
        newq.enqueue(20);
        newq.enqueue(30);
        newq.enqueue(40);

        newq.dequeue();

        newq.printq();
    }


}