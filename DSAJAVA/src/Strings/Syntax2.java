package Strings;
import java.util.*;
public class Syntax2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = "  Ambikaprasadchoudhary  ";
        String st3 = "RAvi";
        System.out.println(st);
        System.out.println(st.trim());
        System.out.println(st.substring(3));
        System.out.println(st.substring(6,8));
        System.out.println(st.replace("Ambika","Ravi"));
        System.out.println(st.startsWith(" "));
        System.out.println(st.endsWith("y"));
        System.out.println(st.charAt(6));
        System.out.println(st.indexOf('d'));
        System.out.println(st.equals(st3));
        System.out.println(st.equalsIgnoreCase(st3));
        System.out.println(st.compareTo(st3));
        System.out.println(st.valueOf(7));
        System.out.println(st.contains("choudhary"));
        System.out.println(st.concat(st3));
        System.out.println(st+st3); // this is also use for concate
    }
}
