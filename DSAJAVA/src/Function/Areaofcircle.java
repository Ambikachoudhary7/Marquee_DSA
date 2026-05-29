package Function;
import java.util.*;
public class Areaofcircle {
    public static double area(int r){
          double  area = r*r*3.14;
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(area(4));
    }
}
