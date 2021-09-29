package ca.javacourse.Class_05;

public class Or_Convert {

    public static void main(String[] args) { //doua moduri de a scrie acelasi cod

        String customerType = "R";
        int subTotal = 150;
        float discountPercent = 0.0f;

        if (customerType.equals("R") && subTotal >=100)
        {
            discountPercent = .2F;
        }

        if (customerType.equals("R") && subTotal <100)
        {
            discountPercent = .1F;
        }

        if (!customerType.equals("R"))
        {
            discountPercent = .4F;
        }

   /*     if (customerType.equals("R"))
        {
            if (subTotal >= 100)
                discountPercent = .2F;
            else
                discountPercent = .1F;
        }
        else discountPercent = .4F;
*/
        System.out.println(discountPercent);
    }
}
