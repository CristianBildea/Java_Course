package ca.javacourse.Class_18;

import java.util.ArrayList;
import java.util.List;

public class RegexReplace {

    public static void main(String[] args) {

        String credit = "This book is Copyright (c) 1992";
        String credit2 = "This movie was recorded in 2010";

        List<String> credits = new ArrayList<>();
        credits.add(credit);
        credits.add(credit2);

        //Change all dates in the list to 2021
        // s.replaceAll("regex"), "replacement')

        for (int x = 0; x < credits.size(); x++)
        {
            String temp = credits.get(x);
            String changed = temp.replaceAll("\\b(19|20)\\d{2}\\b", "2021");
            credits.set(x, changed);
        }

        // Print out the results

        System.out.println(credits.get(0));
        System.out.println(credits.get(1));


    }
}
