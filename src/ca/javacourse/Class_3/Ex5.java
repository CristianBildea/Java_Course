package ca.javacourse.Class_3;

public class Ex5 {

    public static void main(String[] args) {

        float c1 = 30.0f;
        float f1 = 76.00f; //f from float

        float c1_in_f = 0.0f;
        float f1_in_c = 0.0f;

        //Code here (math is done here).
        c1_in_f = (float)9 /5 * c1 + 32;
        f1_in_c = (f1 - 32f) / (9f / 5);

        System.out.print("30C in F is: ");
        //Print answer
        System.out.println(c1_in_f);

        System.out.print("76F in C is: ");
        //Print answer
        System.out.print(f1_in_c);

    }
}
