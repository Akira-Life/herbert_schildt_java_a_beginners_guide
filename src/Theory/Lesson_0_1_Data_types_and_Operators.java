package Theory;

//расчет числа кубических дюймов в кубе
public class Lesson_0_1_Data_types_and_Operators {
    public static void main(String[] args) {
        long ci;
        long im;

        im = 5280 * 12;
        ci = im * im * im;

        System.out.println("В одной кубической миле содержится " + ci + " кубических дюймов");
    }
}

class Lesson_1_1_Hypot {
    public static void main(String[] args) {
        double x, y, z;
        x = 3;
        y = 4;
        z = Math.sqrt(x * x + y * y);
        System.out.println("Длина гипотенузы " + z);
    }
}

class Lesson_1_2_symbol_char {
    public static void main(String[] args) {
        char ch;
        ch = 'X';
        System.out.println("ch содержит " + ch);

        ch++; //инкрементировать переменную ch
        System.out.println("теперь ch содержит " + ch);

        ch = 90;
        System.out.println("теперь ch содежит " + ch);

    }
}

class Lesson_1_3_boolean {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("Значение b " + b);

        b = true;
        System.out.println("Теперь значение b " + b);

        //логическое(булевое) значение можно использовать для управления логическими условиями if
        if (b) System.out.println("Эта инструкция выполняется");

        b = false;
        if (b) System.out.println("Это не сработает так как условие ложное");

        System.out.println("Результат сравнения то же имеет логическое значение 10 > 9 " + (10 > 9));
    }
}

class Lesson_1_4_Literals {
    public static void main(String[] args) {
        System.out.println("Первая строка\nВторая строка");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF");

        int i = 10; //летерал 10
        char ch = 'c'; //летарл c

    }
}

class Lesson_1_5_Variables {
    static int i1 = 10; //переменная живет во всем классе
    public static void main(String[] args) {
        int a = 10; //объявление и создание переменной, создание -это присвоение переменной некоторого значения
        //соответсвующего типа

        double d2 = 22.9; // эта пеерменная живет в теле метода main()
        int x;
        x = 10;
        if (x == 10) { //начало тела if
            int y = 22;//эта переменная доступна в блоке if
            //переменные  i1, a, x доступны в данном блоке
        }

        //переменная y тут не достунпна
        System.out.println("Переменная x и i1(доступна через static) доступна тут " + i1);

        int i2;
        for (i2 = 0; i2 < 3; i2++) {
            int y = -1; //переменная y инициализируется при каждом входе в блок
            System.out.println("y: " + y);//всегда выводится значение -1

            y = 100;
            System.out.println("Изменение значение y: " + y);
        }

        /*
              тут мы пытаемся объявить 2 переменные в разных облостях видимости
              внутри цикла и до цикла
         */

        int count;
        for (count = 0; count < 10; count = count + 1) {
            System.out.println("Значение count " + count);
            // НЕДОПУСТИМО  int count;
            for (count = 0; count < 2; count++) System.out.println("-----");

        }
    }
}

class Lesson_1_6_Increment_and_Decrement {
    public static void main(String[] args) {
        int a1 = 1;
        System.out.println(a1++);
        System.out.println(a1); //постфиксная форма даст результат при следующем обращении

        int a2 = 1;
        System.out.println(++a2); //префиксная форма дает результат сразу
    }
}

class Lesson_1_7_Logical_Operators {
    public static void main(String[] args) {
        int i, j;
        boolean b1, b2;

        i = 10;
        j = 11;

        if (i < j) System.out.println("i < j");
        if (i <= j) System.out.println("i <= j");
        if (i != j) System.out.println("i != j");
        if (i == j) System.out.println("i == j false");
        if (i >= j) System.out.println("i >= j false");
        if (i > j) System.out.println("i > j false");

        b1 = true;
        b2 = false;

        if (b1 & b2) System.out.println("false");
        if (!(b1 & b2)) System.out.println("!(b1 & b2): true");
        if (b1 | b2) System.out.println("b1 | b2: true");
        if (b1 ^ b2) System.out.println("b1 ^ b2: true");

        int n, d, q;

        n = 10;
        d = 2;

        if (d != 0 && (n % d) == 0) System.out.println(d + " является делителем " + n);
        d = 0; // установить для d нулевое значение

        // 2-й операнд не вычисляется поскольку значение перменной d = 0
        if (d != 0 & (n % d) == 0) System.out.println(d + " является делителем" + n);

    }
}

class Lesson_1_8_Casting_incompatible_types {
    public static void main(String[] args) {
        double x , y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); //привели тип double к типу int
        System.out.println("целочисленный результат деление: " + i);

        i = 100;
        b = (byte) i;
        System.out.println("Значение b: " + b);

        i = 257;
        b = (byte) i;
        System.out.println("Значение b: " + b);

        b = 88;
        ch = (char) b;
        System.out.println("ch: " + ch);
    }
}


