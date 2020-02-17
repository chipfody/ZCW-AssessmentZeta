package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {

        Integer counter = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i] == objectToCount) {
                counter++;}
            }

        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        int index = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i].equals(objectToRemove)) {
                objectArray[i] = null;
                index++;
            }
        }
        Integer newIndex = 0;
        Integer[] newArray = new Integer[objectArray.length - index];
        for (int j = 0; j < objectArray.length; j++) {
            if (objectArray[j] != null) {
                newArray[newIndex] = (Integer) objectArray[j];
                newIndex++;
            }
        }

        return newArray;

    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Integer count = 1;
        Object mostPop = objectArray[0];
        Integer tempCount;
        Object temp = 0;

        for (int i = 0; i < objectArray.length; i++) {
            temp = objectArray[i];
            tempCount = 0;
            for (int j = 0; j < objectArray.length; j++) {
                if (temp == objectArray[j]) {
                    tempCount++;
                }
                if ((tempCount > count)){
                    mostPop = temp;
                    count = tempCount;
                }
            }
        }
        return mostPop;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Integer count = 1;
        Object leastPop = objectArray[0];
        Integer tempCount;
        Object temp = 0;

        for (int i = 0; i < objectArray.length; i++) {
            temp = objectArray[i];
            tempCount = 0;
            for (int j = 0; j < objectArray.length; j++) {
                if (temp == objectArray[j]) {
                    tempCount++;
                }
                if ((tempCount < count)){
                    leastPop = temp;
                    count = tempCount;
                }
            }
        }
        return leastPop;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {


        Integer lengthA = objectArray.length;
        Integer lengthB = objectArrayToAdd.length;
        Integer fullLength = lengthA + lengthB;
        Object[] newArray = new Integer[lengthA + lengthB];

        System.arraycopy(objectArray, 0, newArray, 0, lengthA);
        System.arraycopy(objectArrayToAdd, 0, newArray, lengthA,lengthB );

       return newArray;

    }
}
