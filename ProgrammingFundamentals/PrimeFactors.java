import java.util.ArrayList;
import java.util.Collections;

public class PrimeFactors{

    // int num;

    // public PrimeFactors() {
    //     this.num=num;
    // }
    
    public void allFactors(int num){
        ArrayList<Integer> factors = new ArrayList<>();
        System.out.println("Factors of "+num);
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i==0)
                factors.add(i);
            if(i!=num/i)
                factors.add(num/i);
        }
        Collections.sort(factors);
        System.out.println(factors);
    }

    public void primeFactors(int num){
        ArrayList<Integer> factors = new ArrayList<>();
        System.out.println("Factors of "+num);
        int i=2;
        // while(num>1){
        //     if(num%i==0){
        //     num=num/i;
        //     factors.add(i);
        //     }
        //     else{
        //         i++;
        //     }
        // }
        // System.out.println(factors);

        while(num%i==0){
            factors.add(i);
            num=num/i;
        }
        for(i=3;i<Math.sqrt(num);i++){
            while(num%i==0){
                factors.add(i);
                num=num/i;
            }
        }
        factors.add(i);
        //num=num/i;
        System.out.println(factors);
    }
}