package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {

        Integer index = intArray.length;
        Integer intSum = 0;
        for (int i = 0; i < index; i++) {
            intSum += intArray[i];
        }
        return intSum;

        //  Integer s = 0;
        //  for( Integer i : intArray) s += i;
        //  return s;

        // NOTE: here the += should not be intArray[i] b/c it will be looking for the index but the contents so you would
        // get an "out of bounds exception"
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {


        Integer index = intArray.length;
        Integer intProduct = 1;
        for (int i = 0; i < index; i++) {
            intProduct *= intArray[i];
        }
        return intProduct;

        //  Integer p = 1;
        //  for (Integer i : inArray p *= intArray[i];
        //  return p;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {

        Integer index = intArray.length;
        Double intSum = 0.0;
        Double intAverage = 0.0;
        for (int i = 0; i < index; i++) {
            intSum += intArray[i];
        }
        return intSum / index;

        //  return Double.valueOf()(getSum(intArray)/intArray.length);
    }
}
