public class Palindrome {

    public class Stack{
        int data;
        int stackArr[];
        int top;
        Stack(int size){
            stackArr = new int[size];
            this.top=-1;
            }
        public void push(int data){
            if(top==(stackArr.length-1)){
                System.out.println("Stack OverFlow");
                return;
            }
            stackArr[++top] = data;
        }


        public int pop(){
            if(top==-1){
                System.out.println("Stack UnderFlow");
                return -1;
            }
            return stackArr[top--];
        }
    }
        Node head;
        int count=0;

        class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }


        public void append(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            count++;
            return;
            }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            }
        temp.next = newNode;
        newNode.next=null;
        count++;
        }


        public void printList(){
            Node temp = head;
            while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            }
        }
    

    public boolean isPalindrome(){
        Stack st=new Stack(count);
        Node temp=head;
        while(temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            int val=st.pop();
            if(temp.data==val){
                temp=temp.next;
            }
            else{
                return false;
            }
        }
        return true;
    }


  public static void main(String[] args) {
            Palindrome pc = new Palindrome();

            pc.append(10);
            pc.append(20);
            pc.append(30);
            pc.append(20);
            pc.append(10);
            pc.printList();
            System.out.println(pc.isPalindrome());
        }

}