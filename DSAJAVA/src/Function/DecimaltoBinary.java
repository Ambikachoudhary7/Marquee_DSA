package Function;
import java.util.*;
public class DecimaltoBinary {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter decimal number: ");
            int num = sc.nextInt();

            int binary[] = new int[32];
            int index = 0;

            while (num > 0) {
                binary[index] = num % 2;
                num = num / 2;
                index++;
            }

            System.out.print("Binary number: ");

            for (int i = index - 1; i >= 0; i--) {
                System.out.print(binary[i]);
            }
        }
    }
