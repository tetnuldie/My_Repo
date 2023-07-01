package l3_HW;
import static java.lang.Math.*;
public class Task_10 {
    private static double sqr, p, a, b;
    public static void main(String[] args) {
        a=3;
        b=4;

        sqr = a * b / 2;
        p = (sqrt(pow(a, 2) + pow(b, 2))) + a + b;

        System.out.println("sqr= "+sqr+"\np= "+p);
    }
}
