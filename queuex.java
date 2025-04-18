public class queuex{
    int queueArr[];
    int maxSize;
    int rear;
    int front;
    int noItems;

    queuex(int size){
        rear = -1;
        front = 0;
        noItems = 0;
        queueArr = new int[size];
        maxSize = size;
    }

    boolean isempty(){
        return noItems == 0;
    }

    boolean isfull(){
        return noItems == maxSize;
    }

    public void insert(int s){
        if(isfull()){
            System.out.println("queue is full");
        }
        else{
            rear++;
            queueArr[rear] = s;
            noItems++;
            //System.out.println("inserting = " +s);
        }
    }

    public int remove(){
        if(isempty()){
            System.out.println("queue is empty");
            return -1;
        }
        else{
            int temp = queueArr[front];
            //System.out.println("removing +" +queueArr[front]);
            front++;
            noItems--;
            return temp;
        }
    }
}