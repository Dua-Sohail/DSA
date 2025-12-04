public class Functions {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Sunny");
        System.out.println(name.delete(3,5)); //Character from given value deleted

        name.append('o'); //Add character in the same stored variable
        System.out.println(name);

        //For String
        String word = "Sun";
        word= word+ "day";
        System.out.println(word);

    }
}
