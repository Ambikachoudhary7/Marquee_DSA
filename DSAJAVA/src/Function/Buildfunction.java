package Function;
import java.util.*;
public class Buildfunction {
    public static int table(int a){
        int t = 1;
        for(int i=1; i<=10; i++){
            System.out.println(t = a*i);
        }
        return t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println(table(3));
        table(3);
    }
}
