package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import org.tfoc.helpers.Converter;
import org.tfoc.helpers.IntArrayConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class SolutionTest {

    @ParameterizedTest
    @CsvSource(value = {"-1,0,3,5,9,12;9;4",
            "-100,0,1,2,3,4,5,70;70;7",
            ";0;-1",
            "0,1,2,3,4;0;0"}, delimiterString = ";")
    void testCases(@ConvertWith(IntArrayConverter.class) int[] nums, int target, int response) {

        Solution solution = new Solution();
        assertEquals(response, solution.search(Converter.convert(nums), target));
    }

}