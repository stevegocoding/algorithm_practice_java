package com.stevegocoding.leetcode;

import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by magkbdev on 6/24/16.
 */
public class TopKFrequentElementsTest {

    private TopKFrequentElements solution = new TopKFrequentElements();

    @Test
    public void testTopKFrequent1() {
        int[] input = {1, 1, 1, 2, 2, 3};
        List<Integer> res = solution.topKFrequent(input, 2);

        System.out.println(res);

        assertEquals(1, 1);
    }
}
