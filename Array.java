
import java.util.Scanner;

public class Array {

    private int arr[];
    private int rev[];
    Scanner  sc=new Scanner(System.in);
    
    public void input(){
        System.out.print("Enter size of Array: ");
        int size=sc.nextInt();
        System.out.print("Enter "+size+" Elements: ");
        arr = new int[size];
        for(int i=0;i<size;i++){
        arr[i]= sc.nextInt();
        }
    }
    

    public void print(){
        System.out.print("Elements in the Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    public int findMax(){
        int max=arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum num is: "+ max);
        return max;
    }

    public int findSecMax(){
         if (arr.length < 2) {
        return -1;  // Need at least 2 elements
    }
        int max=arr[0];
        int secmax=arr[0];
        for( int num: arr){
            if (num > max) {
                secmax =max;
                max= num;
            }
            else if (num>secmax && num<max) {
                secmax=num;
            }
        }
        if(max==secmax){
            return -1;
        }
        return secmax;
   }


    public void findMin(){
        int min=arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Minimun num is: "+ min);
    }


    public void reverse(){
        rev=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            rev[i]=arr[arr.length-i-1];
        }
    }

    public void printReverse(){
        System.out.print("Reversed Array: ");
        for(int num:rev){
            System.out.print(num+" ");
        }
        System.out.println();
    }


    public void leftRotate(){

        System.out.print("Enter no. of rotations: ");
        int r=sc.nextInt();
        r= r%arr.length;
        int[] temp = new int[r];
        for(int i=0;i<r;i++){
            temp[i] = arr[i];
        }
        for(int i=0;i<arr.length-r;i++){
            arr[i]=arr[r+i];
        }
        for(int i = 0; i < r; i++) {
            arr[arr.length - r + i] = temp[i];
        }
    }
    
    //Another method for Left Rotation
    // public void leftRotate(int[] arr,int i, int j){
    //     int[] temp;
    //     while(i<=j){
    //         temp[i]=arr[i];
    //         arr[i]=arr[j];
    //         arr[j]=arr[i];
    //     }
    // }

    public void rightRotate(){

        System.out.print("Enter no. of rotations: ");
        int r=sc.nextInt();
        r= r%arr.length;
        int[] temp = new int[r];
        for(int i=0;i<r;i++){
            temp[i] = arr[arr.length-r+i];
        }
        for(int i=arr.length-1;i>=r;i--){
            arr[i]=arr[i-r];
        }
        for(int i=0;i<r;i++){
            arr[i]=temp[i];
        }
    }


    public void isArraySorted(){
        String sort="";
        for(int i=1;i<arr.length;i++){
            sort=(arr[i-1]>arr[i])? "Unsorted": "Sorted";
        }
        System.out.println("Array is: "+sort);
    }


    public void isDupicateExists(){
        String dup="";
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
            dup=(arr[i]==arr[j])? "Exists": "does'nt Exists";
            }
        }
        System.out.println("Duplicate Elements "+dup);
    }


    public void moveZeroToEnd(){
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
                index++;
            }
            // else{
            //     int temp=arr[pos];
            //     arr[pos]=arr[i];
            //     pos--;
            // }
        }
        // for(int i=index;i<arr.length;i++){
        //     arr[i]=0;
        // }
    }

    public int removeDuplicatesfromSortedArray(){
        if(arr.length == 0) return 0;

        int pos=1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[pos]=arr[i];
            }
        }
        return pos;
    }


     public void combineValues(){
        int[] A=new int[]{25,14,12,74,58,74,98,84,14,25};
        int[] B=new int[]{87,11,10,81,67,94,74,82,15,87};

        System.out.println("A    B      C");
        for(int i=0;i<A.length;i++){
            if(A[i]>B[i]){
                System.out.println(A[i]+"   "+B[i]+"    "+A[i]+"."+B[i]);
            }
            else{
                System.out.println(A[i]+"   "+B[i]+"    "+B[i]+"."+A[i]);
            }
        }
    }



    public void printMaxMinTemp(){

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        float[] temperature=new float[days.length];
        float max=Float.NEGATIVE_INFINITY;
        float min=Float.POSITIVE_INFINITY;
        int maxDay=0;
        int minDay=0;
        for(int i=0;i<temperature.length;i++){
            System.err.print("Enter temperature for Day "+(i+1)+": ");
            temperature[i]=sc.nextFloat();
            if(temperature[i]>max){
                max=temperature[i];
                maxDay=i;
            }
            if(temperature[i]<min){
                min=temperature[i];
                minDay=i;
            }
        }
        System.out.println("Maximum Temperature is "+max+" on Day "+days[maxDay]);
        System.out.println("Minimum Temperature is "+min+" on Day "+days[minDay]);

    }

    public void separateNumbers(){
        int[] arr={45,-6,0,-14,25};
        int pos=0;
        int neg=0;
        int zero=0;
        int posSum=0;
        int negSum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                pos++;
                posSum+=arr[i];
            }
            else if(arr[i]<0){
                neg++;
                negSum+=arr[i];
            }
            else{
                zero++;
            }
        }
        System.out.println("Positive Numbers: "+pos );
        System.out.println("Negative Numbers: "+neg );
        System.out.println("Zero Number: "+zero);
        System.out.println("Sum of Postive Numbers: "+posSum );
        System.out.println("Sum of Negative Numbers: "+negSum );

    }


    public void jumpSearch(){
        int step= (int) Math.sqrt(arr.length);
        System.out.print("enter target" );
        int target=sc.nextInt();
        for(int i=0;i<arr.length;i+=step){
            if(arr[i]<target){
                if(arr[step]>target){
                    i++;
                while(step-1>i){
                    if(arr[i]==target){
                        System.out.println("Target is at index: "+ i);
                        return;
                        }
                    step--;
                    }
                }
            }
        }
    }











}