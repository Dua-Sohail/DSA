import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows= sc.nextInt();
        
        System.out.print("Enter number of columns: ");
        int cols= sc.nextInt();

        int matrix[][] =new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                 matrix[i][j]= sc.nextInt();
            }
        }

        System.out.println("Enter the number to check: ");
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                 if( matrix[i][j]==x){
            System.out.println("Index of given x is: ["+i+"]["+j+"]");
            }

            }
        }   
    }
}
