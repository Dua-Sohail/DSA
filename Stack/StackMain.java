public class StackMain{
    public static void main(String args[]){
        
        String str ="{(a+b)(a-b)}";
        Stack s = new Stack(str.length());

        if(s.checkForBraces(str)){
            System.out.println("Braces are balanced.");
        }
        else 
        System.out.println("Not balanced");
    }
}


