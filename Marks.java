
import java.util.Scanner;


public class Marks{
public static void main(String[] args) {
   // int marks[] =new int [3];
/*  marks[0]=95;
    marks[1]=97;
    marks[2]=99;
*/

    //int marks[]={95,97,99};

    Scanner sc = new Scanner(System.in);
    int size =sc.nextInt();
    int marks[] =new int[size];
    for (int i=0;i<=size-1;i++) {
        marks[i]=sc.nextInt();
    }
    for (int i=0;i<=size-1;i++) {
        System.out.println(marks[i]);
    }
}
}