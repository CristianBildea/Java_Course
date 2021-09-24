package ca.javacourse.Class_04;

public class NumberConversion {

    public static void main(String[] args) {

        //Convert this to a value
        String ageText = "22";
        int age = Integer.parseInt(ageText);

       // double age = Double.parseDouble(ageText);


        //Convert to a string
        int daysBeforeTest = 6;
        String dayText = Integer.toString(daysBeforeTest);

        //My favourite novel is "Blade Runner".

        //String r = "My favourite novel is \"Blade Runner\".";

       // r = "The backlash character looks like \\ thanks.";

        //String r = "This is line on \nThis is line two\netc...";

        String r = "A\tB\tC"; //only for 3 character or less)
        System.out.println(r);



    }
}
