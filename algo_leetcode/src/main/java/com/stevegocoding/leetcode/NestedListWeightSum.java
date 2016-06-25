package com.stevegocoding.leetcode;

/**
 * Created by magkbdev on 6/17/16.
 */

import com.stevegocoding.leetcode.utils.NestedInteger;

import java.util.List;

public class NestedListWeightSum {
    public int depthSum(List<NestedInteger> nestedList) {
        return dfs(nestedList, 1);
    }

    private int dfs(List<NestedInteger> nestedList, int level) {
        int res = 0;
        for (NestedInteger e : nestedList) {
            if (e.isInteger()) {
                res += e.getInteger() * level;
            }
            else {
                res += dfs(e.getList(), level + 1);
            }
        }
        return res;
    }
}