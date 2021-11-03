package ca.javacourse.Class_14;

import java.util.Arrays;

public class Exercise25 {

    public static void main(String[] args) {

        int[] nums = new int[10];

        for (int x = 0; x < nums.length; x++)
        {
            nums[x] =(int)(Math.random() * 10);
        }

        System.out.println(Arrays.toString(nums));

        int temp = nums[0];

        for (int x=1; x < nums.length; x++)
        {
            nums[x - 1] = nums[x];
        }

        nums[nums.length -1] = temp;

        System.out.println(Arrays.toString(nums));

    }
}
