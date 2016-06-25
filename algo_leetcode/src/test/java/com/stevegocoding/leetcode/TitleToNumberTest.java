package com.stevegocoding.leetcode;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by magkbdev on 6/20/16.
 */
public class TitleToNumberTest {

    private TitleToNumber solution = new TitleToNumber();

    @Test
    public void testTitleToNumber1() {
        int res1 = solution.titleToNumber("AB");
        int res2 = solution.titleToNumber("Z");

        assertEquals(res1, 28);
        assertEquals(res2, 26);
    }

}