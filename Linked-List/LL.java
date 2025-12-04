public class LL {
    Node head;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    //Method to insert at first for Singly LL
    public void insertFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            newNode.next=null;
        }
        else{
        newNode.next = head; // newnode->[10,null] ------ [20,head]->[30,next]->[40,tail]
        head = newNode;
        }
    }
    //MEthod to  insert at endfor Singly LL
    public void insertLast(int data){
        Node newNode = new Node(data);
        if (head == null) {  // if list is empty
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) { // traverse till last node
            temp = temp.next;
        }
        temp.next = newNode;
    }



    //Insert at Middle in Single LL
    public void insertAtMid(int data){
        System.out.println("Enter Position: ");
        // int pos= sc.nextint();
        Node newnode=new Node(data);


    }


    //Method to display Singly List 
    public void printSingly(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    public void removeToLast(){
        int count=1;
        int pos=2;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        if(head==null || head.next==null){
            return;
        }
        if(pos<1 || pos>count) {
        System.out.println("Invalid position");
        return;
        }
        if (pos == 1) {
            Node nodeToMove = head;
            head = head.next;
            temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = nodeToMove;  // Attach old head at end
            nodeToMove.next = null;  // Make it last node
            return;
        }
        temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        Node nodeToMove=temp.next;
        temp.next=temp.next.next;
        temp = head;
        while (temp.next != null) {
        temp = temp.next;
        }
        temp.next = nodeToMove;
        nodeToMove.next = null;
    }
















































}
