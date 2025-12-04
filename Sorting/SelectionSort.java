import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Size of Array: ");
        int size=sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();    
        }
        for (int i=0;i<arr.length;i++){
             int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp= arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
            
        }    
        for (int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
    }
}
