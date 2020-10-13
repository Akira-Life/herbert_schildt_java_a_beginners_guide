package Practice_2_Conditional_Operators;


import java.io.IOException;
import java.util.Scanner;

public class Practice_1_Nested_if_else_Switch_statements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Справка");
        System.out.println("  1. if");
        System.out.println("  2. switch");
        System.out.println("Выберите");

        char userSymbol = scanner.next().charAt(0);
        switch (userSymbol) {
            case '1':
                System.out.println("Инструкция if:\n ");
                System.out.println("if(условие) инструкция");
                System.out.println("else инструкция");
                break;
            case '2':
                System.out.println("Инструкция switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println("  case констант:");
                System.out.println("  последовательность инструкция");
                System.out.println(" breack");
                System.out.println(" // ...");
                System.out.println("}");
                break;
            default:
                System.out.println("Запрос не найден");
        }
    }
}

class Practice_2_Nested_if_else_Switch_statements {
    public static void main(String[] args) throws IOException {


            Scanner scanner = new Scanner(System.in);

            char choice, ignore;

            do {
                System.out.println("Справка");
                System.out.println("  1. if");
                System.out.println("  2. switch");
                System.out.println("  3. for");
                System.out.println("  4. while");
                System.out.println("  5. do-while");
                System.out.println("  6. break");
                System.out.println("  7. continue");
                System.out.println("Выберите (q - выход): ");

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while (choice < '1' | choice > '5');

            System.out.println("\n");

            switch (choice) {
                case '1':
                    System.out.println("Инструкция if:\n");
                    System.out.println("if(условие) инструкция");
                    System.out.println("else инструкция");
                    break;
                case '2':
                    System.out.println("Инструкция switch:\n");
                    System.out.println("switch(выражение) {");
                    System.out.println("  case константа:");
                    System.out.println("    последовательность инструкций");
                    System.out.println("    breack;");
                    System.out.println("  //...");
                    System.out.println("}");
                    break;
                case '3':
                    System.out.println("Цикл for\n");
                    System.out.println("for(инициализация; условие; итерация");
                    System.out.println("     инструкция");
                    break;
                case '4':
                    System.out.println("Цикл while:\n");
                    System.out.println("while(условие) инструкция");
                    break;
                case '5':
                    System.out.println("Цикл do-while");
                    System.out.println("do {");
                    System.out.println("  инструкция");
                    System.out.println("} while (условие)");
                    break;
                case '6':
                    System.out.println("Инструкция break:\n");
                    System.out.println("break; или метка;");
                    break;
                case '7':
                    System.out.println("Инструкция continue:\n");
                    System.out.println("continue; или метка;");
                    break;
            }
    }
}

class contune_test {
    public static void main(String[] args) {
        outerloop:
        for (int i = 0; i < 5; i++) {
           for (int j = 0; j < 5; j++) {
               System.out.println(i);
                   if (i == 2) continue outerloop;
               System.out.println(i);
           }
        }
    }
}

/*
        напишите программу которая считывает символы с клавиатуры
        до тех пор, пока не встрерится точка
 */

class Test_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char userSymbol;
        char stop = '.';
        while (true) {
            userSymbol = scanner.next().charAt(0);
            if (userSymbol != stop) {
                System.out.println(userSymbol);
            }else if (userSymbol == stop) break;
        }
    }
}

class Test_2 {
    public static void main(String[] args) {
        for (int i = 1000; i >= 0; i -= 2) {
            System.out.println(i);
        }
    }
}

class Test_3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " ");
            if ((i % 2) == 0) continue;
            System.out.println();
        }
    }
}

class Test_4 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i = i * 2) {
            System.out.println(i);
        }
    }
}





