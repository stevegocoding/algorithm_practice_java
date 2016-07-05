package com.stevegocoding.leetcode;

import com.stevegocoding.leetcode.utils.NestedInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by magkbdev on 7/3/16.
 */
public class NestedListWeightSumII {

    public int depthSumInverse(List<NestedInteger> nestedList) {
        ArrayList<Integer> path = new ArrayList<>();
        for (NestedInteger ni : nestedList) {
            helper(ni, 0, path);
        }

        int res = 0;
        int n = path.size();
        for (int i = n - 1; i >= 0; --i) {
            res += path.get(i) * (n - i);
        }

        return res;
    }

    private void helper(NestedInteger nestedInt, int level, ArrayList<Integer> path) {
        if (level >= path.size()) {
            path.ensureCapacity(level + 1);
        }

        if (nestedInt.isInteger()) {
            path.set(level, path.get(level) + nestedInt.getInteger());
        }
        else {
            for (NestedInteger ni : nestedInt.getList()) {
                helper(ni, level + 1, path);
            }
        }
    }
}
