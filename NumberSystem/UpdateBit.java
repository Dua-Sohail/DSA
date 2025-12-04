import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n=5;
        int pos=sc.nextInt();
        int bitmask=1<<pos;
        int operation=sc.nextInt();

        if(operation==0) //Clear Operation
        {
        int notBitmask= ~(bitmask);
        int num=notBitmask&n;
        System.out.println(num+" in decimal");
        System.out.println("Bit at position "+pos+ " is: ZeRo");
        }
        else{ //Set Operation
        int num= bitmask | n; 
        System.out.println(num+" in decimal"); //the positon of that number will be 1 
        System.out.println("Bit at position "+pos+ " is: One");
        }
    }
}
