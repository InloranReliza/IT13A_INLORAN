package Prelim;

public class lab_act1_arithmetics {

    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 4;
        int n3 = 6;
        int n4 = 3;

        int t1 = n1 * n2 + n3;
        int t2 = n1 - n2 / n3;
        int t3 = n1 + n2 + n3 / n4;
        int t4 = n1 * n3 - 4 * 4;

        System.out.println("10 * 4 + 6 = " + n1);
        System.out.println("(10 - 4) % 6 = " + n2);
        System.out.println("(10 + 4 + 6) / 3  =" + n3);
        System.out.println("10 * 6 - (4 * 4) = " + n4);
    }
}
