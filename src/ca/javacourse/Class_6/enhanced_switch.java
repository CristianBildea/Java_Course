package ca.javacourse.Class_6;

public class enhanced_switch {
    public static void main(String[] args) {

        char productCode = 'X';
        String productName;

        switch (productCode)
        {
            case 'A', 'B' ->  productName = "Apple";
            case 'X' -> productName = "X-Ray";
            case 'Y' -> productName ="Yeti";
            default ->  productName = null;
        }
    }
}
