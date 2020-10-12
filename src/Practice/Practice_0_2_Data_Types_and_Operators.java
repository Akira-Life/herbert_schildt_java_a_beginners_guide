package Practice;

public class Practice_0_2_Data_Types_and_Operators {
    public static void main(String[] args) {
        boolean p, q;
        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

        p = true; q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = true; q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = false; q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = false; q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        System.out.println("-----------------------------");

        int p1, q1;
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p1 = 1; q1 = 1;
        System.out.print(p1 + "\t" + q1 + "\t");
        System.out.print((p1 & q1) + "\t" + (p1 | q1) + "\t");
        System.out.println((p1 ^ q1) + "\t" + ((p1 == 1) ? 0 : 1));

        p1 = 1; q1 = 0;
        System.out.print(p1 + "\t" + q1 + "\t");
        System.out.print((p1 & q1) + "\t" + (p1 | q1) + "\t");
        System.out.println((p1 ^ q1) + "\t" + ((p1 == 1) ? 0 : 1));

        p1 = 0; q1 = 1;
        System.out.print(p1 + "\t" + q1 + "\t");
        System.out.print((p1 & q1) + "\t" + (p1 | q1) + "\t");
        System.out.println((p1 ^ q1) + "\t" + ((p1 == 1) ? 0 : 1));

        p1 = 0; q1 = 0;
        System.out.print(p1 + "\t" + q1 + "\t");
        System.out.print((p1 & q1) + "\t" + (p1 | q1) + "\t");
        System.out.println((p1 ^ q1) + "\t" + ((p1 == 1) ? 0 : 1));

    }
}
