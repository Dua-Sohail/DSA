import java.util.Scanner;

public class ClearBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5;
        int pos=sc.nextInt();
        int bitmask=1<<pos;
        int notBitmask= ~(bitmask);
        int num=notBitmask&n;
        System.out.println(num+" in decimal");
        System.out.println("Bit at position "+pos+ " is: ZeRo");
    }
    }

