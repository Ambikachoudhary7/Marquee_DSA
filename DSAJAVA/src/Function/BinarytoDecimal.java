package Function;
import java.util.*;
public class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int decimal = 0;
        int power = 0;
        while(n>0){
            int rem = n%10;
            decimal+=rem*Math.pow(2,power);
            power++;
            n/=10;
        }
        System.out.println("Decimal value is: "+decimal);
    }
}
