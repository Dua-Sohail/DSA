import java.util.ArrayList;
public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist=new ArrayList<>();
        arrlist.add(50);
        arrlist.add(100);
        arrlist.add(150);
        arrlist.add(200);
        arrlist.add(250);
        arrlist.add(50);
        arrlist.add(300);
        arrlist.add(100);
        arrlist.add(250);
        arrlist.add(50);
        arrlist.add(300);
        arrlist.add(450);
        arrlist.add(50);
        arrlist.add(250);
        arrlist.add(400);
        arrlist.add(350);
        arrlist.add(100);
        arrlist.add(400);
        arrlist.add(600);
        arrlist.add(333);
        
        ArrayListOperations.Printlist(arrlist);
        ArrayListOperations.printSize(arrlist);
        ArrayListOperations.PrintUnique(arrlist);
        ArrayListOperations.PrintDuplicate(arrlist);
        ArrayListOperations.maxNum(arrlist);
    }
}
