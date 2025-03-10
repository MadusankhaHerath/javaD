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
    
}