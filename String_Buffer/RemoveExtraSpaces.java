package String_Buffer;

public class RemoveExtraSpaces {

    public static void main(String[] args) {
        
        String sentence = "         Hi I am            Abdul Moid";

        System.out.println();
        System.out.println(sentence);
        System.out.println(sentence.replaceAll("\\s", ""));
    }
}
