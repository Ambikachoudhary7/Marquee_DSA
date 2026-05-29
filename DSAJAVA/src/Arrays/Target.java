package Arrays;
import java.util.*;
public class Target {
    public static boolean present(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(target==arr[i]){
                return true;
            }
        }
        return false;
    }
    public static int Target(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 5, 3, 8, 9};
        System.out.println(present(arr, 7));
        System.out.println(Target(arr, 2));
    }
}
