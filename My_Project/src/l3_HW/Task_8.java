package l3_HW;

public class Task_8 {
    private static double res, a, b, c, d;
    public static void main(String[] args) {
        a=1;
        b=2;
        c=3;
        d=4;

        res = (a * b / c / d) - (((a * b) - c) / c / d);

        System.out.println("res= "+res);
    }
}
