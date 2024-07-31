package String_Buffer;
import java.util.Random;

public class RandomString {

    static String generateString(int size) {

        Random random = new Random();
        StringBuffer sb = new StringBuffer(size);
        int i = 0;

        while (i < size) {
            char ch = (char)(97 + (random.nextFloat() * 26));
            sb.append(ch);
            i++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println(generateString(15));
    }
 
}
