package Arrays;
import java.util.*;
public class MoveZeroEnd {
    public static void moveZeroEnd(int[] arr){
        int j = 0; // i take reference variable which start to pointing 1st index
        for(int i=0; i<arr.length; i++){ // traverse arrray
            if(arr[i]!=0){  // check that those element is not equal to zero
                int temp = arr[i]; // swap non - zero element with starting index
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 0, 4, 0, 0, 6};
        moveZeroEnd(arr); // calling function
        for(int num: arr){
            System.out.println(num); // print element
        }
    }
}
