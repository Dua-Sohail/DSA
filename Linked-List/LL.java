public class LL {
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

     //Method to insert at first for Doubly LL
    public void addfirst(int data){
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

    //Method to display Singly List 
    public void printSingly(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    public void printDoublyReverse(){

        Node temp=tail;
        System.out.print("Null--> ");
        while(temp!=null){
            System.out.print(temp.data+"<-->");
            temp=temp.prev;
        }
        System.out.println("Null");
    }
}

