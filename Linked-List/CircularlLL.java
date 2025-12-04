public class CircularlLL {
    Node head;
    Node tail;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void addfirst(int data){
        Node newnNode = new Node(data);
        if(head==null){
            head=tail=newnNode;
            return;
        }
        newnNode.next=head;
        head=newnNode;
    }
    
}
