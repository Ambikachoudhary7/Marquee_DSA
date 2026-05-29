import java.util.*;
public class FindNcr {
    public static long factorial(int n){
        int  fact = 1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }
    public static long ncr(int n, int r){
        long factN = factorial(n);
        long factr = factorial(r);
        long factnr = factorial(n-r);
        long NCr = factN/factr*factN;
        return NCr;
    }
    public static long npr(int n, int r){
        long factN = factorial(n);
        long factnr = factorial(n-r);
        long npr = factN/factnr;
        return npr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(8));
        System.out.println(ncr(8,3));
        System.out.println(npr(8,2));
    }
}
