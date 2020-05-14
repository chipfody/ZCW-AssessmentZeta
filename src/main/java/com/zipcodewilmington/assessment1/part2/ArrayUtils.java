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

        int count = 0;
        for (Object to : objectArray) {
            if (to.equals ( objectToCount ))
                count += 1;
        }
        return count;
    }


    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
//
        ArrayList<Object> newArray = new ArrayList ();
        for (Object item : objectArray) {
            if (!item.equals ( objectToRemove )) newArray.add ( item );
        }
        Integer[] foo = new Integer[newArray.size ()];
        return newArray.toArray ( foo );

    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
//
        int max = Integer.MIN_VALUE;
        int maxOcc = 0;
        Object result = null;
        for (Object to : objectArray) {
            maxOcc = getNumberOfOccurrences( objectArray, to );
            if (maxOcc > max) {
                max = maxOcc;
                result = to;
            }
        }
        return result;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
//
      int min = Integer.MAX_VALUE;   //[or int = Integer.MAX_VALUE;   or int min = objectArray.length;
      int minOcc = 1;
      Object result = null;
      for (Object to : objectArray) {
           minOcc = getNumberOfOccurrences(objectArray, to);
       if (minOcc < min) {
            min = minOcc;
            result = to;
           }
         }
          return result;
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

        System.arraycopy ( objectArray, 0, newArray, 0, lengthA );
        System.arraycopy ( objectArrayToAdd, 0, newArray, lengthA, lengthB );

        return newArray;


//      OPTION 2:
//      ArrayList<Object> result = new ArrayList<>();
//      result.addAll(Arrays.asList(objectArray));
//      result.addAll(Arrays.asList(objectArrayToAdd));
//      for (Object to: objectArrayToAdd) {
//            result.add(to);
//      Integer[] array = result.toArray(new Integer[objectArray.length + objectArrayToAdd.length]);
//        }
//
//       return array;
    }
}
