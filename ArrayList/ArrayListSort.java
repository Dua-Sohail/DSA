
import java.util.*;

public class ArrayListSort {
    public static void main(String[] args){
        ArrayList<String> names=new ArrayList<>();
        names.add("Ayan");
        names.add("Umer");
        names.add("Zain");
        names.add("Usman");
        names.add("Ali");

        Collections.sort(names);
        for (String i : names) {
        System.out.println(i);
        }
    }
}
