package ca.javacourse.Assignment_1_Cristian_Bildea;

import java.util.Scanner;


public class ShapesMenu {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        String response;
        String subResponse;
        // MAIN MENU LOGIC
        while (true) {
            System.out.println(ShapesMenuConstant.MainMenuText);
            System.out.print(ShapesMenuConstant.Prompt);
            response = s.nextLine();
            // Display Triangle Menu -  Chose B
            if (response.equalsIgnoreCase("1")) {
                while (true) {
                    System.out.println(ShapesMenuConstant.TriangleMenuText);
                    System.out.print(ShapesMenuConstant.Prompt);
                    subResponse = s.nextLine();
                    if (subResponse.equalsIgnoreCase("1")) {
                        // Right Sided Triangle
                        System.out.println("Please Enter the size of the base of the triangle: ");
                        response = s.nextLine();
                        double num = Double.parseDouble(response);
                        for (int i = 0; i < num; i++) {
                            for (int j = 0; j <= i; j++) {
                                System.out.print('*');
                            }
                            System.out.println(' ');
                        }
                    }
                    if (subResponse.equalsIgnoreCase("2")) {
                        // Isosceles Triangle
                        System.out.println("Please Enter the size of the base of the triangle: ");
                        response = s.nextLine();
                        double num = Double.parseDouble(response);
                        if ((num % 2) != 1 || num <= 1) {
                            System.out.println("I can not do an Isosceles like that, see");
                        }
                        double linesToDraw = Math.floor(num / 2) + (num % 2);
                        for (int i = 1; i <= linesToDraw; i++) {
                            double asterixToDraw = 1 + ((i - 1) * 2);
                            for (int j = 0; j < ((num - asterixToDraw) / 2); j++) {
                                System.out.print(' ');
                            }
                            for (int j = 0; j < asterixToDraw; j++) {
                                System.out.print('*');
                            }
                            for (int j = 0; j < ((num - asterixToDraw) / 2); j++) {
                                System.out.print(' ');
                            }
                            System.out.println(' ');
                        }
                    }
                    // User selection Q - Goes back to the previous menu
                    if (subResponse.equalsIgnoreCase("Q")) {
                        break;
                    }
                }
            }
            //User selection 2 -- Rectangles
            if (response.equalsIgnoreCase("2")) {
                //Rectangle
                System.out.println("Please enter the height of the rectangle");
                response = s.nextLine();
                double height = Double.parseDouble(response);
                System.out.println("Please enter the width of the rectangle >");
                response = s.nextLine();
                double width = Double.parseDouble(response);
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        System.out.print('*');
                    }
                    System.out.println(' ');
                }
            }
            // User selection Q - Quits the program
            if (response.equalsIgnoreCase("Q")) {
                System.out.println("Thank you for using this program.");
                break;
            }
        }
    }
}
