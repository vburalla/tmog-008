package org.tfoc.helpers;

import lombok.experimental.UtilityClass;

import java.util.Arrays;

@UtilityClass
public class Converter {

    public Integer[] convert(int[] input) {

        if(input == null)
            return null;
        else {
            Integer[] result = new Integer[input.length];
            for (int i = 0; i < input.length; i++) {
                result[i] = Integer.valueOf(input[i]);
            }
            return result;
        }
    }
}
