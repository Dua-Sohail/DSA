public class NumberConversion {
    

    public static int decimalToBinary(int num){
        int ans=0;
        int pow=1;
        while(num>0){
            int rem=num%2;
            num=num/2;
            ans+=rem*pow;
            pow*=10;
        }
        return ans;
    }

    public static int decimalToOctal(int num){
        int ans=0;
        int pow=1;
        while(num>0){
            int rem=num%8;
            num=num/8;
            ans+=rem*pow;
            pow*=10;
        }
        return ans;
    }

    public static int binaryToDecimal(int num){
        int ans=0;
        int pow=1;
        while(num>0){
            int rem=num%10;
            num=num/10;
            ans+=rem*pow;
            pow*=2;
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.print("Decimal To Binary: "+decimalToBinary(7));
        System.out.println();
        System.out.print("Binary To Decimal: "+binaryToDecimal(111));
        System.out.println();
        System.out.println("Decimal To Octal: "+decimalToOctal(15));
    }
}
