
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        int numbers[]= new int[size];
        System.out.println("Enter values for array:- ");
        for(int i=0;i<=size-1;i++) {
        System.out.print("Value of index"+ (i+1) +" is: ");
        numbers[i]=sc.nextInt();
        }
        System.out.println("Enter the number to check: ");
        int x = sc.nextInt();
    
        for(int i=0;i<=size-1;i++){
            if(numbers[i]==x){
            System.out.println("Index of given x is: "+i);
            }
        }
    }  
}
