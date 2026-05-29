package Arrays;
import java.util.*;
public class BuiltArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int j=0; j<arr.length; j++) {
            if(arr[j]%2==0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }
    }
}
