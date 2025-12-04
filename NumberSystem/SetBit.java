import java.util.Scanner;

public class SetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5; //0101
        int pos=sc.nextInt();
        int bitmask = 1<<pos;
        int num= bitmask | n; 
        System.out.println(num+" in decimal"); //the positon of that number will be 1 
        System.out.println("Bit at position "+pos+ " is: One");
        }

    }

