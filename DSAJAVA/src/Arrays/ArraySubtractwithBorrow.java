package Arrays;
import java.util.*;
public class ArraySubtractwithBorrow {
    public static int[] subtractArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        int borrow = 0;

        for (int i = arr1.length - 1; i >= 0; i--) {
            int a = arr1[i] - borrow;
            int b = arr2[i];

            if (a < b) {
                a += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            result[i] = a - b;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = {9, 5, 7, 9};
        int arr2[] = {7, 2, 7, 8};
        int[] result = subtractArray(arr1, arr2);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    }
