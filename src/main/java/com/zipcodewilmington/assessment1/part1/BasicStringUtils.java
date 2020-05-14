package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        char[] camelCaseArray = str.toCharArray();
        char firstLetter = Character.toUpperCase(camelCaseArray[0]);
        camelCaseArray[0] = Character.toUpperCase(camelCaseArray[0]);

        return String.valueOf(camelCaseArray);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        return new StringBuilder(str).reverse().toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

         return camelCase(reverse(str));
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

         return str.substring(1, str.length() - 1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        Integer index = str.length();
        char[] newString = str.toCharArray();
                for (int i = 0; i < index; i++) {
                    if (Character.isUpperCase(newString[i])) {
                        newString[i] = Character.toLowerCase(newString[i]);
                    } else {
                        newString[i] = Character.toUpperCase(newString[i]);
                    }
                }
        return String.valueOf(newString);

        // should make second "if else" statement b/c the character could be white space or punctuation
        // the upper code would fails if one of these was hit on.
    }

}

