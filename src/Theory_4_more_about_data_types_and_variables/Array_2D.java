package Theory_4_more_about_data_types_and_variables;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_2D {
    public static void main(String[] args) {
        // 1D array
        int[] array_1 = new int[10];
        //альтернатива
        int[] array_2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // 2D array
        int[][] array_3 = new int[10][10]; // тут создан 2-х мерный масив и
                                          // наполнен 10 NULL
        int j;
        //наполним 2D array объектами
        for (int i = 0; i < array_3.length - 1; ++i) {
            for (j = 0; j < array_3.length - 1; ++j) {
                array_3[i][j] = (i * array_3.length - 1) + i + 1;
                System.out.println(array_3[i][j] + " ");
            }

        }

        //нерегулярные массивы
        int[][] array_4 = new int[10][];

        array_4[0] = new int[10];
        array_4[1] = new int[9];
        array_4[2] = new int[8];
        array_4[3] = new int[7];
        array_4[4] = new int[6];

        array_4[0][2] = 1;
        System.out.println(array_4[0][2]);

        int n = 10;
        int[][] array_5 = new int[n][];

        for (int i = 0; i < n; i++) {
            array_5[i] = new int[i];
            for (int k = 0; k < array_5[i].length; k++)
               array_5[i][k] = i;
        }

        for (int i = 0; i < array_5.length; i++) {
            System.out.println(Arrays.toString(array_5[i]));
        }

        System.out.println(array_5[1][0]);


    }
}
