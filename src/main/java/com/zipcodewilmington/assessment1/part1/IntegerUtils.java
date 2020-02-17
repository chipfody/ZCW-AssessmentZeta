package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {

        Integer intSum = 0;
        for (int i = 0; i <= n; i++) {
            intSum += i;
        }
        return intSum;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {

        Integer intProduct = 1;
        for (int i = 1; i <=n; i++) {
            intProduct *= i;}

        return intProduct;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {


        String intString = Integer.toString(val);
        System.out.println(intString);
        StringBuilder toReverse = new StringBuilder();
        toReverse.append(intString);
        toReverse = toReverse.reverse();
        System.out.println(toReverse);
        String sb = toReverse.toString();
        Integer result = Integer.parseInt(sb);

        return result;
    }
}
