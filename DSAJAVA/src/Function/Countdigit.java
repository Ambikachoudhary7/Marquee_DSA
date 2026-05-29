package Function;
import java.util.*;
public class Countdigit {
    public static int count(int n){
        int count = 0;
        while(n>0){
           count++;
           n = n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(count(122345));
    }
}
