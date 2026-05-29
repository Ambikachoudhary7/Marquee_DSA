package Arrays;
import java.util.*;
public class ShorestdistanceofEven {
    public static int MIndistance(int[] arr){
        int mindistance = Integer.MAX_VALUE;
        int prev = -1;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0 && arr[i]%2==0){
                count++;
            }
            if(prev != -1){
                int distance = i-prev;
                mindistance = Math.min(mindistance, distance);
            }
            prev = i;
        }
        if(count<=1){
            return -1;
        }
        return mindistance;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 5, 4, 7, 8};
        System.out.println(MIndistance(arr));
    }
}
