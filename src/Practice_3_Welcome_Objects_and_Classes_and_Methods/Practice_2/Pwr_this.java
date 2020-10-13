package Practice_3_Welcome_Objects_and_Classes_and_Methods.Practice_2;

public class Pwr_this {
    double b;
    int e;
    double val;

    Pwr_this(double base, int exp) {
        this.b = base;
        this.e = exp;

        this.val = 1;
        if (exp == 0) return;
        for (; exp > 0; exp--) this.val = this.val * base;
    }

    double get_pwr() {
        return this.val;
    }
}

class DemoPwr {
    public static void main(String[] args) {
        Pwr_this x = new Pwr_this(4.0, 2);
        Pwr_this y = new Pwr_this(2.5, 1);
        Pwr_this z = new Pwr_this(5.7, 0);

        System.out.println(x.b + " в степени " + x.e + " равно " +
                            x.get_pwr());

        System.out.println(y.b + " в степени " + y.e + " равно " +
                y.get_pwr());

        System.out.println(z.b + " в степени " + z.e + " равно " +
                z.get_pwr());
    }
}

class test {
    int a = 1;

    test(int a1) {
        a = a1;
    }
}

class testDemo {
    public static void main(String[] args) {
        test test = new test(5);
        System.out.println(test.a);

    }
}

class testDemo2 {
    public static void main(String[] args) {
        test test2 = new test(10);
        System.out.println(test2.a);
    }
}

class DumbExample {

    private int value;

    public void revealTheMystery(int someValue) {
        this.value = someValue;
    }

    public static void main(String args[]) {
        DumbExample obj1 = new DumbExample();
        DumbExample obj2 = new DumbExample();
        obj1.revealTheMystery(42);  // В этом вызове метода this указывает на obj1
        obj2.revealTheMystery(666);  // В этом вызове метода this указывает на obj2
    }
}

class Test {
    int aa;
    int bb;
    int cc;
    Test(int aa, int bb) {
        this.aa = aa;
        this.bb = bb;
    }

    Test(int aa, int bb, int cc) {
        this(aa, bb);
        this.cc = cc;
    }
}
