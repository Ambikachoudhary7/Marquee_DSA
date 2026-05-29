package Function;
import java.util.*;
public class FactorialNcrNpr {
    public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
           fact*=i;
        }

        return fact;
    }
    public static  int ncr(int n, int r){
        int factN = factorial(n);
        int factR = factorial(r);
        int factNR = factorial(n - r);

        int result = factN / (factR * factNR);

        return result;
    }
    public static int npr(int n, int r){
        int factN = factorial(n);
        int factR = factorial(r);
        int factNR = factorial(n-r);
        int res = factN/factNR;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(5));
        System.out.println(ncr(9, 3));
        System.out.println(npr(6, 2));
    }
}
