class linkedlist{
    int size;
    Chainnode head;

    public linkedlist() {
        this.size = 0;
        this.head = null;
    }

    public boolean isempty(){
        return head == null;
    }

    public int size(){
        return size;
    }

    public void addfirst(Object ele){
        if(isempty()){
            head = new Chainnode(ele);
        }
        else{
            head = new Chainnode(ele, head);
        }
        size++;

    }

    public void addlast(Object ele){
        if(isempty()){
            head = new Chainnode(ele);
        }
        else{
            Chainnode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Chainnode(ele);
        }
        size++;
    }

    public Object removefirst(){
        Object rmdata = null; 
        if(isempty()){
            System.out.println("list is empty");
        }
        else{
            rmdata = head.next;
            head = head.next;
            size--;
        }
        return rmdata;
    }

    public Object removelast(){
        Object rml = null;
        if(isempty()){
            System.err.println("list is empty");
        }
        else{
            if(size == 1){
                rml = head.data;
                head = null;
            }
            else{
                Chainnode temp = head;
                while(temp.next.next != null )
                {
                    temp = temp.next;
                }
                rml = temp.next.data;
                temp.next = null;
            }
            size --;
        }
        return rml ;
    }

    public void insertnode(int index,Object elt){
        if(index >= 0 && index <= size){
            if(index ==0 && size ==0){
                head = new Chainnode(elt);
                size++;
            }
            else if(index == 0 && size > 0){
                head = new Chainnode(elt, head);
                size ++;
            }
            else if(index == size){
                Chainnode temp = head;
                for(int i = 0; i<index-1; i++){
                    temp = temp.next;
                }
                temp.next = new Chainnode(elt);
                size ++;
            }
            else{
                Chainnode temp = head;
                for(int i=0; i<index-1; i++){
                    temp = temp.next;
                }
                temp.next = new Chainnode(elt, temp.next);
                size++;
            }
        }
        else{
            System.err.println("error input");
        }
    }
    public Object removenode(int index){
        Object rmd = null;

        
            if(index == 0){
                rmd = head.data;
                head = head.next;
                size--;
            }
            else if (index < size-1) {
                Chainnode temp = head;
                for(int i=0; i<index-1; i++){
                    temp = temp.next;
                }
                rmd = temp.next.data;
                temp.next = temp.next.next;
                size--;
            }
            else if(index == size -1){
                
                if(size== 1){
                    rmd = head.data;
                    head = null;
                }
                else{
                    Chainnode temp = head;
                   while(temp.next.next !=null){
                        rmd = temp.next.data;
                        temp.next = null;
                   }
                    size--;  
                }
            }
            else{
                System.out.println("error input");
            }

            return rmd;
       
    }

    public void Display(){
        Chainnode temp = head;
        if(isempty()){
            System.out.println("Linked list is empty");
        }
        else{
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        linkedlist l1 = new linkedlist();

        l1.addfirst(10);
        l1.addfirst(20);
        l1.addfirst(30);
        l1.addfirst(40);
        l1.addlast(50);

        l1.removefirst();
        l1.removelast();

        l1.insertnode(1, 100);
        l1.removenode(2); 

        l1.Display();
    }
    
}