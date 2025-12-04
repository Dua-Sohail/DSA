public class ReverseString {
    public static void main(String[] args) {


        //(1)
        String name="computer";
        String reversed1 = new StringBuilder(name).reverse().toString();
        System.out.println(reversed1);

        //(2)
         char[] arr = name.toCharArray();
        
        String reversed = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed += arr[i];
        }
        
        System.out.println(reversed);

        }
    }

