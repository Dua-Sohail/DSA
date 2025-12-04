
import java.util.Scanner;

public class BubbleSort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Size of Array: ");
        int size=sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();    
        }
        //Ascending Order
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    } 
     System.out.println("Sorted Array in Ascending Order:");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        //Descending order
         for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]<arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    } 
     System.out.println("Sorted Array in Descending Order:");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}