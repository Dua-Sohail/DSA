public class compareTo {
    public static void main(String[] args) {
        String name1="Umar";
        String name2="Umer";

        //Printing SubString
        String line="For You A Thousand Times Over";
        System.out.println(line.substring(9, line.length()));


        //Comparing two Strings
        //if(name1==name2) This is also correct but fails sometimes
        if(name1.compareTo(name2)==0){
        System.out.println(name1+ " and " +name2 + " are same");
        }
        else{
            System.out.println(name1+" and "+name2 +" are different");
        }
        
    }
}
