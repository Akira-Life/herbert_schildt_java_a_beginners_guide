package Practice_1_Data_Types_and_Operators;

/*
        Нужно выявить все простые числа от 2 до N-ое

        ЗАДАЧА ОКАЗАЛОСЬ НЕ ПРОСТОЙ ДЛЯ МЕНЯ!
        ЖЕЛАТЕЛЬНО ПЕРЕРЕШАТЬ ДРУГИМИ СПОСОБАМИ ЧЕРЕЗ ПАРУ НЕДЕЛЬ!

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





