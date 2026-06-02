package Arrays;
import java.util.*;
public class MaxsumofSunArray {
    public static int maxSumSubArray(int arr[]){
        int sum = 0; // first intialize with zero
        int max = Integer.MIN_VALUE;  // intialize max with min value;
        for(int i=0; i<arr.length; i++){  // traversal the subArray
            sum+=arr[i];            // add in sum variable
            max = Math.max(max, sum); // compare max and sum and which was greater we store in max
            if(sum<0){
                sum = 0;  /// we take condition that check the sum value if sum is less than zero ther we restore sum = 0
            }
        }
        return max; // return max subArray sum
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, -3, 5, 7, -8,3,};
        System.out.println(maxSumSubArray(arr)); // calling function and print
    }
}
