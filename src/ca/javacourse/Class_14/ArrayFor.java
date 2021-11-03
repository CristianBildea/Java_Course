package ca.javacourse.Class_14;

public class ArrayFor {

    public static void main(String[] args) {

        String[] colours = new String[] {"Blue", "White", "Black"};

        //System.out.println(colours[5]);

        // For loop (Uses a number to access the array by index)

        for(int x = 0; x < colours.length; x++)
        {
            System.out.println(colours[x]);

            if (colours[x].equals("Gray"))
            {
                colours[x] = "Pink";
            }
        }

        //Enhanced For loop (Accesses each member of the array one by one, index is not used).

        for (String c : colours)
        {
            System.out.println(c);
        }
    }
}
