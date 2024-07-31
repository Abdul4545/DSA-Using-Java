package String_Buffer;

public class Main {

    public static void main(String[] args) {

        // constructor 1
        StringBuffer sb = new StringBuffer();
        System.out.println();
        sb.append("Abdul Moid");
        String str = sb.toString();
        System.out.println(str);

        // constructor 2
        StringBuffer sb2 = new StringBuffer("Abdul Moid");
        sb2.append(" Khan");

        System.out.println(sb2);

        // constructor 1
        StringBuffer sb3 = new StringBuffer(30);

        sb3.append("hello");
        sb3.append(" How are you ?");
        sb3.insert(5, " World,");

        System.out.println(sb3);
        
        System.out.println(sb.capacity());
    }

}
