package l3_HW;

import static java.lang.Math.*;
public class Task_7 {
    private static double a,b,c,res;
    public static void main(String[] args) {
        a=1.3289;
        b=5.0;
        c=3;

        res = ((b + sqrt(pow(b, 2) + (4 * a * c))) / (2 * a)) - (pow(a, 3) * c) + pow(b, -2);

        System.out.println("result= "+res);
    }
}