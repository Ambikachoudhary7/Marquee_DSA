package Strings;
import java.util.*;
public class practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = "programmer@gmail.com";
//        System.out.println("UserName Name: "+st.substring(0,10));
//        System.out.println("Domain name: "+ st.substring(11, 20));
//        System.out.println(st.endsWith("com"));

        // second method
        int i=st.indexOf('@');
        String uname = st.substring(0,i);
        String domain = st.substring(i, st.length());
        System.out.println(uname);
        System.out.println(domain);
        System.out.println(domain.startsWith("gmail"));

    }
}