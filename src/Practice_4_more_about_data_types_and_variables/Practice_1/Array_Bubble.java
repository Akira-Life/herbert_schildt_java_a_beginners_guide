package Practice_4_more_about_data_types_and_variables.Practice_1;

public class Array_Bubble {
    static int[] bubbleSort(int nums[]) {
        int temp;
        for (int i = 1; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[j - 1] > nums[j]) {
                    temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = { 99, -10, 100123, 18, -978, 5623, 463,
                -9, 287, 49 };
        for (int i = 0; i < nums.length; i++) {
            bubbleSort(nums);
            System.out.println(nums[i]);
        }
    }
}
