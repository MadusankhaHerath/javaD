class Chainnode{
    Chainnode next;
    Object data;


chainnode(Object d){
    this.data = d;
    this.next = null;
    }
}
Chainnode(Object d, Chainnode n){
    this.data = d;
    this.next = n;
}
