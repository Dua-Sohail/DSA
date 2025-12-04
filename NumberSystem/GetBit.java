import java.util.Scanner;

public class GetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5;
        int pos=sc.nextInt();
        int bitmask=1<<pos;
        if((bitmask & n)==0){
            System.out.println("Bit at position "+pos+ " is: ZERO");
        }
        else
        System.out.println("Bit at position "+pos+ " is: ONE");
    }
}
