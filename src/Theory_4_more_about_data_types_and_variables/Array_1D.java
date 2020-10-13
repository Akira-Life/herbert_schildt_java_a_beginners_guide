package Theory_4_more_about_data_types_and_variables;


/*
        массивы яв-ся объектами
 */

public class Array_1D {
    public static void main(String[] args) {
        int[] sample = new int[10];
//       for (int j = 0; j < 10; j++) {
//           System.out.println(sample[j]); //тут показанно что наш массив наполнин 10 NULL
//       }
        int i;

        for (i = 0; i < 10; i++) {
            sample[i] = i;
        }

        for (int a = 0; a < 10; a++) {
            System.out.println(sample[a]);
        }
    }
}

/*
    поиск минимального и максимального числа в массиве
 */

class minimum_and_maximum {
    public static void main(String[] args) {
        int[] nums = new int[10];



        nums[0] = 99;
        nums[1] = -10; // -10 > 99 ? нет ->
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;

        int min = nums[0], max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= max) {
                max = nums[i];
            }
            if (nums[i] <= min) {
                min = nums[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
