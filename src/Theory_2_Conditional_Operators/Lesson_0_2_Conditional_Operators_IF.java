package Theory_2_Conditional_Operators;

import java.util.Scanner;

/*
    Игра в угадывание букв
 */
public class Lesson_0_2_Conditional_Operators_IF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = 'K';
        char ch1 = scanner.next().charAt(0);

        System.out.println("Задумана буква в диапозон от 'A' до 'Z'!!!");
        System.out.println("Попытаемся её угадать!");

        if (ch1 == ch) {
            System.out.println("*** Вы угадали! ***");
        }else {
            System.out.println("*** Извините но вы промахнулись! ***");
        }
    }
}

class Nested_if_statements {
    public static void main(String[] args) {
        int i = 10;
        int j = 8;
        int a = 77;
        int b = 99;
        int k = 111;
        int d = 8;
        int c = 22;


        if (i == 10) {
            if (j < 20) a = b;
            if (k > 100) c = d; else a = c;
        }else {
            a = d;
        }
        System.out.println(i);
        System.out.println(j);
        System.out.println(a);
        System.out.println(b);
        System.out.println(k);
        System.out.println(d);
        System.out.println(c);
    }
}

class Nested_if_else_statements {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 6; x++) {
            if (x == 1) {
                System.out.println("x = 1");
            }else if (x == 2) {
                System.out.println("x = 2");
            }else if (x == 3){
                System.out.println("x = 3");
            }else if (x == 4) {
                System.out.println("x = 4");
            }else {
                System.out.println("Значение x находится вне диапазона 1 - 4");
            }
        }
    }
}

class Nested_switch_statements {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            switch (i) {
                case 0:
                    System.out.println("i = 0");
                    break;
                case 1:
                    System.out.println("i = 1");
                    break;
                case 2:
                    System.out.println("i = 2");
                    break;
                case 3:
                    System.out.println("i = 3");
                    break;
                case 4:
                    System.out.println("i = 4");
                    break;
                default:
                    System.out.println("i >= 5");
            }
        }
    }
}

class for_loops {
    public static void main(String[] args) {
        double num;
        double sroot;
        double rerr;

        for (num = 1.0; num < 100; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Корень квадратный из " + num + " равен " + sroot);

            // вычисление ошибки округления
            rerr = num - (sroot * sroot);
            System.out.println("Ошибка округления" + rerr);
            System.out.println();
        }
    }
}

