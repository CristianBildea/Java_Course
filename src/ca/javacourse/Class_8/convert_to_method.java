package ca.javacourse.Class_8;

public class convert_to_method {

    public static void main(String[] args) {

        int sumFromFunction = addThings(1, 10);
        System.out.println(sumFromFunction);
    }

    //What values are need to send to this function?
    public static int addThings(int start, int end)
    {

        int sum = 0;

        for (int x= start; x <= end; x++)
        {
            //sum = sum + x is the same with sum +=x
            sum += x;
        }

        //PROCESSING HERE

        return sum;

    }
}
