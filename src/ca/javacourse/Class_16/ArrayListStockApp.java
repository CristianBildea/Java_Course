package ca.javacourse.Class_16;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListStockApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        List<SalesItem> stockList = new ArrayList<>();

        stockList.add(new SalesItem(1, "Lawnmower", new BigDecimal("549.99"), 22));
        stockList.add(new SalesItem(2, "Weeder", new BigDecimal("249.99"), 12));

        System.out.println("Enter the sku to display the description >");
        String searchSkuInput = sc.nextLine();
        int searchSku = Integer.parseInt(searchSkuInput.trim());

        boolean productFound = false;

        for(SalesItem si : stockList)
        {
            if (si.sku == searchSku)
            {
                System.out.println("The item description for the sku " + searchSkuInput + " is " + si.name);
                productFound = true;
                break;
            }
        }
        if (!productFound)
        {
            System.out.println("We do not carry this sku in our system.");
        }



    }
}
