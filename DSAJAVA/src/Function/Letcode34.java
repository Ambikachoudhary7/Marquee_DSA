package Function;
import java.util.*;
public class Letcode34 {
    static int Range(int[] arr, int target){
       int  start = 0;              // this pointer pointing to zeroth index
       int end = arr.length-1;      //this pointer pointing to last index

        for(int i=start; i<=end; i++){      // Traversing the whole array
            if(target == arr[i]){           // this condition is used to checked element is present or not
                return i;                   // if it is present in array then, its return index of element
            }
        }
        return -1;          // if not present retunrn -1
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8};
        int target = 5;
        System.out.println(Range(arr, 5));  // calling function and print

    }
}
