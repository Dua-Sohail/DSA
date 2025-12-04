import java.util.Scanner;
public class OneDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter 5 elements: ");
        for(int i=0;i<arr.length;i++){
           // System.out.println(sc.nextInt(arr[i]));
            arr[i]=sc.nextInt();
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
