package Arrays;
import java.util.*;
public class MissingNumber {
    public static int missing(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        for(int j = 1; j<=arr.length+1; j++){
            if(!set.contains(j)){
                return j;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 3, 4,5, 6};
        System.out.println(missing(arr));
    }
}
