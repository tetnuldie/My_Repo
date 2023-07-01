package l3_HW;

import static java.lang.Math.*;
public class Task_12 {
    private static int abcd,mul;
    public static void main(String[] args) {
        abcd = 5371;
        mul=1;
        int x=0;
        int j =1000;
        for (int i = 1; i < 5; i++) {
            x= abcd/j;
            abcd=abcd-(x*j);
            mul=mul*x;
            j=j/10;
        }
        System.out.println("l= "+mul);
    }

}