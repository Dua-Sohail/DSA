public class PrintNum{
    public static void Print(int n){
        if(n>5){
            return;
        }
        System.out.println(n);
        Print(n+1);
    }
    public static void main(String args[]){
        int n=1;
        Print(n);
    }
}