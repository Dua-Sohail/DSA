
public class DoublyLL {

    Node head;
    Node tail;

    private class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev=prev;
        }
    }


    public void addFirst(int data){
        Node newnode= new Node(data);
        if(head==null){
            head=tail=newnode;
            
        }
    else{
        head.prev=newnode;
        newnode.next=head;
        head=newnode;
        }
    }

    public void addLast(int data){
        Node newnode= new Node(data);
        if(head==null){
            head=tail=newnode;
        }
        tail.next=newnode;
        newnode.prev=tail;
        tail=newnode;
    }

    public void printDoubly(){
        Node temp=head;
        System.out.print("null--> ");
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.print("null\n");
    }

    public void printReverse(){

        Node temp=tail;
        System.out.print("null--> ");
        while(temp!=null){
            System.out.print(temp.data+"<-->");
            temp=temp.prev;
        }
        System.out.println("Null\n");
    }
}
