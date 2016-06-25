package com.stevegocoding.leetcode;

/**
 * Created by magkbdev on 6/18/16.
 */

import com.stevegocoding.leetcode.utils.NestedInteger;
import com.stevegocoding.leetcode.utils.NestedIntegerImpl;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Arrays;

public class NestedListWeightSumTest {

    NestedListWeightSum solution = new NestedListWeightSum();

    @Test
    public void testNestedListWeightSum1() {

        List<NestedInteger> child1 = Arrays.asList(new NestedIntegerImpl(1), new NestedIntegerImpl(1));
        List<NestedInteger> child2 = Arrays.asList(new NestedIntegerImpl(1), new NestedIntegerImpl(1));
        List<NestedInteger> list = Arrays.asList(
                new NestedIntegerImpl(child1),
                new NestedIntegerImpl(2),
                new NestedIntegerImpl(child2));

        int res = solution.depthSum(list);
        assertEquals(res, 10);
    }

}
