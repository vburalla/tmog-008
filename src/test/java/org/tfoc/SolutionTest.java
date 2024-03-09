package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class SolutionTest {

    @Test
    void testSolution() {

        Solution solution = new Solution();
        Integer[] search = new Integer[]{-1,0,3,5,9,12};
        var a = solution.search(search, 9);

        assertEquals(4, a);
        log.info("Don't forget to write the tests to make sure it works. Enjoy!");
    }

}