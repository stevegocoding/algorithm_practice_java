package com.stevegocoding.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by magkbdev on 6/25/16.
 */
public class GenerateAbbriviationsTest {

    private GenerateAbbriviations solution = new GenerateAbbriviations();

    @Test
    public void testGenerateAbbr1() {
        String s = "word";

        List<String> res = solution.generateAbbrivations(s);

        assertEquals(1, 1);
    }
}
