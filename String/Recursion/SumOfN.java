
import java.util.Scanner;

public class SumOfN {
    public static void Sum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return ;
        }
        sum+=i;
        Sum(i+1, n, sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Sum(1, n, 0);
    }
}
