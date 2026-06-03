package Arrays;
import java.util.*;
public class SumTarget {
    public static boolean to_Sum(int k, int[] arr){
        for(int i=0; i<arr.length; i++){        // traverse array and start with zeorth index
            for(int j=i+1; j<arr.length; j++){  // traverse array start with one index
                if(arr[i]+arr[j]==k){  // tske condition to check both index sum==target or not
                    return true; // yes then return true
                }
            }
        }
        return false; // ele false
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 4, 6, 8};
        boolean x = to_Sum(30, arr); // calling function
        System.out.println(x); // print the result
    }
}
