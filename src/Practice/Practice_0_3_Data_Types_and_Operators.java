package Practice;

import java.util.Scanner;

/*
        Нужно выявить все простые числа от 2 до N-ое

 */
public class Practice_0_3_Data_Types_and_Operators {
    public static void main(String[] args) {
        boolean simpleNumbersStartup;
        int integers;
        int primeNumbers;

        for (integers = 2; integers < 100; integers++) {
            simpleNumbersStartup = true;


            for (primeNumbers = 2; primeNumbers <= integers / primeNumbers; primeNumbers++) {
                if ((integers % primeNumbers) == 0) {
                    simpleNumbersStartup = false;
                }

            }

            if (simpleNumbersStartup) {
                System.out.println(integers);
            }
        }
    }
}


// простые числа от 2 до 100





