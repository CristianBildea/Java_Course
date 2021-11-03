package ca.javacourse.Class_14;

import java.util.List;
import java.util.ArrayList;

public class TwoSum {

    public static void main(String[] args) {

        int[] inputArray = new int[] {4, 5, 6, 7};
        int targetValue = 11;

        List<int[]> results = twoSum(inputArray, targetValue);

        System.out.println("Here are the combinations we found");

        for (int[] r : results)
        {
            System.out.println("[" + r[0] + "," + r[1] + "]");
        }

       // twoSum(inputArray, targetValue);

    }

    /**
     * This method finds combinations of array elements that add up to "target"
     * This method should only find the first combination
     * @param nums The series of numbers input by the user
     * @param target target number to find
     * @return An array with the index of the found numbers (if any)
     */

    private static List<int[]> twoSum(int[] nums, int target)
    {
        List<int[]> foundCombinations = new ArrayList<>();

        for (int a = 0; a < nums.length; a++)
        {
            for (int b = a + 1; b < nums.length; b++)
            {
                if (nums[a] + nums[b] == target)
                {
                    foundCombinations.add(new int[] {a, b});
                }
                //  System.out.println(nums[a] + " " + nums[b]);
            }
        }
            return foundCombinations;

    }
}
