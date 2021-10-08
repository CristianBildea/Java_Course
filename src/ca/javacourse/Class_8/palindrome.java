package ca.javacourse.Class_8;

public class palindrome {

    public static void main(String[] args) {

        String myString = "MAM";
        int stringLenght = myString.length();
        boolean isPalendrome = true;

        for(int x =0; x < stringLenght / 2; x++)
        {
            char left = myString.charAt(x);
            char right = myString.charAt(stringLenght - x - 1);

           // System.out.println(left);
            //System.out.println(right);

            if (left != right)  //!= - not equels
            {
                isPalendrome = false;
                break;
            }

        }

        if (isPalendrome)
        {
            System.out.println("IS A PALINDROM");
        }
        else
        {
            System.out.println("IS NOT A PALINDROME");
        }

        //How do you get the length of the string?
        //How do you get a specific letter in the string (eg. 2nd letter "e")



       // String secondLetter = myString.substring(1, 2); //is start from 0, is start before "e" and is finish after the "e"

      //  System.out.println(stringLenght);
      //  System.out.println(secondLetter);

      //  String myStringinReverse = new StringBuilder(myString).reverse().toString();
    }
}
