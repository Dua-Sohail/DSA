
import java.util.LinkedList;

public class MergeList {

    public static LinkedList<Integer> mergeTwoSortedList(LinkedList<Integer> l1, LinkedList<Integer> l2){
        LinkedList<Integer> merged = new LinkedList<>();


        int i=0; int j=0;
        while(i<=l1.size()&& j<=l2.size()){
            if(l1.get(i)<=l2.get(j));{
                merged.add(l1.get(i));
                i++;
            } else
            {
                merged.add(l2.get(j));
                j++;
            }
        }

    }


    ///------------------------------------MAIN CLASS------------------------------------------///
    public static void main(String args[]){
        LinkedList<Integer> l1= new LinkedList<Integer>();
        l1.add(1);
        l1.add(3);
        l1.add(5);


        LinkedList l2=new LinkedList();
        l2.add(2);
        l2.add(4);
        l2.add(6);
    
        mergeTwoSortedList(l1, l2);

    }
}

