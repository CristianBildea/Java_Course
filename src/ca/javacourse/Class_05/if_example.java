package ca.javacourse.Class_05;

import java.util.Scanner;

public class if_example {

    public static void main(String[] args) {

        final int VOTING_AGE = 18;

        //Scanner
        //
        // Ask the user for his/her age.
        //IF it's over 18, then print "Can vote."
        //If not , then "Sorry, you can only vote in x years."

        Scanner sc = new Scanner(System.in);
        System.out.println ("Please indicate your age >");
        int age = sc.nextInt();

        boolean canVote = age > VOTING_AGE;

        if (canVote) {
            System.out.println("Congrats, you can vote.");
            System.out.println("Come back next time");
        } else {
            System.out.println("Sorry you can't vote, come back in " + (VOTING_AGE - age) + " years.");
        }

        // Do not do this->  if (canVote == false)
        if (!canVote)
        {
            System.out.println("Even if you can't vote here is a great web page about voting");
        }
    }
}
