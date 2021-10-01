package ca.javacourse.Class_6;

import java.util.Scanner;

public class Case_switch_exercise {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("Please enter a province code: ");

        String provinceName = null;

        String provinceCode = sc.nextLine(); //get a province cod from the user

        //"bc" -> "BC"

        switch (provinceCode.toUpperCase().trim()) //when user type with upper to use upper and lower case and trim if we type with space
        {
            case "BC":
                provinceName = "British Columbia";
                break;
            case "ON":
                provinceName = "Ontario";
                break;
            case "QC":
            case "PQ":
                provinceName = "Quebec";
                break;
            default:
                provinceName = "Not Found / Invalid";

        }

        System.out.println("The province name for province code " + provinceCode + " is " + provinceName);


    }
}
