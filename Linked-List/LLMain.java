public class LLMain {

    public static void main(String[] args) {
        DoublyLL list =new DoublyLL();

        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.printDoubly();
        list.printReverse();
       // list.removeToLast();
        // System.out.println();
        // list.printSingly();

    }
}
