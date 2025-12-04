
import java.util.Scanner;

public class Strings{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String firstname= "Dua";
        String lastname= "Sohail";
        String fullname= firstname + " " + lastname;  //Concatenation
        System.out.println(fullname);
        System.out.println(fullname.length());  //No. of characters
        System.out.print("Enter a line: ");
        String printline= sc.nextLine();
        System.out.println(printline);

    }
}