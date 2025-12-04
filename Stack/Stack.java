// class Stack{

// // int arr1[]=new int[5];
// // int arr2[]=new int[3];
// // int arr3[]=new int[4];
// Node top=null;
// int size=0;
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//     }
// }
// public void push(int data){
//     Node newnode= new Node(data);
//     if(size==0){
//         top=newnode;
//         size++;
//     }
//     else{
//     newnode.next=top;
//     top=newnode;
//     size++;
//     }
// }
// public void peek(){
//     // if(top==null){
//     //     System.out.println("Stack Underflow");
//     //     return;
//     // }
// System.out.print("Top Element: "+top.data);
// System.out.println();
// }
// public void pop(){
//     if(top== null){
//     System.out.println("Stack Underflow");
//     }
//     else{
//         System.out.print("Top Element: "+top.data);
//     top=top.next;
//     size--;
//     }
// }
// public void stackSize(){
//     System.out.println("Size of Stack: "+size);
// }
// public void print(){
//     System.out.println("Elements in the Stack: ");
//     while(top!=null){
//         System.out.print(top.data+" --> ");
//         top=top.next;
//     }
//     System.out.print("Null");
// }
class Stack {

    char[] arr;
    int top;
    int size;
    Stack(int size) {
        this.size = size;
        arr = new char[size];
        top = -1;
    }

    // Stack(int size) {
    //     arr = new int[size];
    //     top = -1;
    // }

    public boolean isEmpty() {
        return top == -1;
    }
    boolean isFull() {
        return top==size - 1;
    }


    public void push(char val) {
        if (top == arr.length) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = val;
    }

    public char pop() {
        if (isEmpty()) {
            System.out.print("Stack Underflow");
            return 0;
        }
        else
        return arr[top--];
    }

    public boolean checkForBraces(String st) {
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch == '(' ||ch =='[' || ch == '{') {
                push(ch);
            }
            else if (ch ==')' || ch ==']' ||ch == '}') {
                if (isEmpty()) {
                    System.out.println("Error: Right side has more closing braces.");
                    return false;
                }
            }
        }
        // if (!isEmpty()) {
        //     System.out.println("Error: Left side has more opening braces.");
        //     return false; 
        //     }
        return true;
    }    

    


















    // public void print() {
    //     if (isEmpty()) {
    //         System.out.println("Stack is empty");
    //         return;
    //     }

    //     int temp = top;
    //     while (temp >= 0) {
    //         System.out.print(arr[temp--] + " ");
    //     }
    //     System.out.println();
    // }

    // public void sameStackPrint() {
    //     if (isEmpty()) {
    //         return;
    //     }
    //     int temp = arr[top--];
    //     sameStackPrint();
    //     System.out.print(temp + " ");
    //     arr[++top] = temp;
    // }



    // public boolean checkParenthesis(){
    //     if(arr.charAt[i]=='[')
    // }
}

// public void equalStack(){
//     int sum1=0,sum2=0,sum3=0;
//     for(int j=arr1.length-1;j>=0;j++){
//         sum1+=arr1[j];
//     }
//         System.out.println("Sum of Array1: "+sum1);
//     for(int j=arr2.length-1;j>=0;j++){
//         sum2+=arr2[j];
//         System.out.println("Sum of Array1: "+sum2);
//     }
//     for(int j=arr3.length-1;j>=0;j++){
//         sum3+=arr3[j];
//         System.out.println("Sum of Array1: "+sum3);
//     }

