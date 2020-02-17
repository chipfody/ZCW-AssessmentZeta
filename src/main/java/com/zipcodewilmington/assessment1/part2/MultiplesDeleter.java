package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        Integer index = 0;
        Integer index2 = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                ints[i] = -1;
                index++;
            }
        }
        Integer[] newArray = new Integer[ints.length - index];
       for (int j = 0; j < ints.length; j++) {
           if (ints[j] > 0) {
                newArray[index2] = ints[j];
                index2++;
            }
       }
        return newArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {

        Integer index = 0;
        Integer index2 = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                ints[i] = -1;
                index++;
            }
        }
        System.out.println(Arrays.toString(ints));
        System.out.println(index);

        Integer[] newArray = new Integer[ints.length - index];
        for (int j = 0; j < ints.length; j++) {
            if (ints[j] > 0) {
                newArray[index2] = ints[j];
                index2++;
            }
        }

        return newArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        Integer index = 0;
        Integer index2 = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 3 == 0) {
                ints[i] = -1;
                index++;
            }
        }
        System.out.println(Arrays.toString(ints));
        System.out.println(index);

        Integer[] newArray = new Integer[ints.length - index];
        for (int j = 0; j < ints.length; j++) {
            if (ints[j] > 0) {
                newArray[index2] = ints[j];
                index2++;
            }
        }
        return newArray;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {

        Integer index = 0;
        Integer index2 = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % multiple == 0) {
                ints[i] = -1;
                index++;
            }
        }
        System.out.println(Arrays.toString(ints));
        System.out.println(index);

        Integer[] newArray = new Integer[ints.length - index];
        for (int j = 0; j < ints.length; j++) {
            if (ints[j] > 0) {
                newArray[index2] = ints[j];
                index2++;
            }
        }
        return newArray;
    }
}
