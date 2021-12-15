package anagram;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter string 1: ");
        String string1 = scanner.nextLine();

        System.out.println("Please enter sting 2: ");
        String string2 = scanner.nextLine();

        string1 = string1.replaceAll("\\s+", "").toLowerCase();
        string2 = string2.replaceAll("\\s+", "").toLowerCase();

        if (isAnagram(string1, string2)) {
            System.out.println(string1 + " " + string2 + " are Anagrams");
        } else {
            System.out.println(string1 + " " + string2 + " are not Anagrams");
        }

    }

    public static boolean isAnagram(String string1, String string2) {
        if(string1.length() != string2.length()) {
            return false;
        } else {
            char[] string1Array = string1.toCharArray();
            char[] string2Array = string2.toCharArray();

            Arrays.sort(string1Array);
            Arrays.sort(string2Array);

            return Arrays.equals(string1Array, string2Array);
        }
    }
}

/* a) What is the value displayed by the expression bert.length()?
*   Answer: String bert = "Did Bert went to the Codersbay? Yes he did.";
        System.out.println(bert.length());
       -->  43;
*  b) What is the value returned by the method call bert.charAt(12)?
*   Answer: System.out.println(bert.charAt(12));
*    --> t;
*  c) Write an expression that refers to the letter C in the string referred to by bert.
*   Answer: int index = bert.indexOf('C');
            System.out.println(index); --> 21;
*      -->  bert.charAt(21);*/
