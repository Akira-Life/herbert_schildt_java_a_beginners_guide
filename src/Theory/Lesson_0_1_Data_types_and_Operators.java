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

class Increment_and_Decrement {
    public static void main(String[] args) {
        int a1 = 1;
        System.out.println(a1++);
        System.out.println(a1); //постфиксная форма даст результат при следующем обращении

        int a2 = 1;
        System.out.println(++a2); //префиксная форма дает результат сразу
    }
}


