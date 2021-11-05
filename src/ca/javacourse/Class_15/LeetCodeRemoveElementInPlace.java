package ca.javacourse.Class_15;

public class LeetCodeRemoveElementInPlace {

    public static void main(String[] args) {

        int[] source = new int[] {4, 7, 8, 8, 2, 5, 2, 5};

        int limit = removeElement(source, 2);

        System.out.println(limit);

        for (int x = 0; x < limit; x++)
        {


            System.out.println(source[x]);
        }


    }

    private static int removeElement(int[] nums, int val)
    {
        int count = 0;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != val)
            {
                nums[count++] = nums[i];

            }
        }
        return count;
    }
}
