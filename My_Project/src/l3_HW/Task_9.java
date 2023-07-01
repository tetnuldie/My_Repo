package l3_HW;

import static java.lang.Math.*;
public class Task_9 {
    private static double res, x, y;
    public static void main(String[] args) {
        x=30;
        y=60;

        res = ((sin(x)+ cos(y))/(cos(x)- sin(y)))* tan(x*y);

        System.out.println("res= "+res);
    }
}
