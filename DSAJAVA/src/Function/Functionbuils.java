package Function;
import java.util.*;
public class Functionbuils {
    public static int even(int start , int end){
        short sum = 0;
        for(int i=start; i<=end; i++){
            if(i%2==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(even(2, 9)) ;
    }
}
