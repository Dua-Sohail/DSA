import java.util.ArrayList;

public class ArrayListOperations{     
    public static void Printlist( ArrayList<Integer> arrlist){
            System.out.println("Elements in the list: "+arrlist);
    }


    public static void printSize(ArrayList<Integer> arrlist){
        System.out.println("Size of List: "+arrlist.size());
    }


    public static void PrintUnique(ArrayList<Integer> arrlist){
        System.out.print("Unique Elemnts: ");
        for(int i: arrlist){
            if(arrlist.indexOf(i)==arrlist.lastIndexOf(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }


    public static void PrintDuplicate(ArrayList<Integer> arrlist){
        System.out.print("Duplicate Elemnts: ");
        ArrayList<Integer> printed = new ArrayList<>();
        for(int i: arrlist){
            if(arrlist.indexOf(i)!=arrlist.lastIndexOf(i) && !printed.contains(i)){
                System.out.print(i+" ");
                printed.add(i);
            }
        }
        System.out.println();
    }

    public static void maxNum(ArrayList<Integer> arrlist){
        int max=arrlist.get(0);
        for(int i: arrlist){
            if(max<i){
                max=i;
            }
        }
        System.out.println("Maximum No. in the list: "+max);
        System.out.println();
    }




   
}