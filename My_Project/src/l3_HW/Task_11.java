package l3_HW;
import static java.lang.Math.*;
public class Task_11 {
    private static double l, x1, x2, y1, y2;
    public static void main(String[] args) {
        x1=5;
        x2=2;
        y1=1;
        y2=-3;

        l = sqrt(pow((x1-x2), 2) + pow((y1-y2), 2));

        System.out.println("l= "+l);
    }
}
