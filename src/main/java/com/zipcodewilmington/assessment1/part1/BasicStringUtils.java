package com.zipcodewilmington.assessment1.part1;

import java.util.ArrayList;

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

        StringBuilder revString = new StringBuilder();
        revString.append(str);

        return revString.reverse().toString();

        //return new StringBuilder(str).reverse().toString();
        //or
        //String newStr = "";
        //for (int  i = str.length() - 1; i >=0; i--); {
        //  newStr = newStr + str.charAt(i);
        //  return newStr;


    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

        Integer strLength = str.length();
        char[] revCamelArray = str.toCharArray();
        revCamelArray[strLength - 1] = Character.toUpperCase(revCamelArray[strLength - 1]);
        String newWord = String.valueOf(revCamelArray);

        StringBuilder reverseCamel = new StringBuilder();
        reverseCamel.append(newWord).reverse();
        return reverseCamel.toString();

        // or...
        // camelCase(reverse(str));


        // return ;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        Integer index = str.length();
        return str.substring(1, index - 1);

        // or return str.substring(1, str.length() - 1;
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
                // or return new String(newString);

        // should make second "if else" statement b/c the character could be white space or punctuation
        // the upper code would fails if one of these was hit on.
    }

}

