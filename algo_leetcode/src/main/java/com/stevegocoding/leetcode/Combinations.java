package com.stevegocoding.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by magkbdev on 7/4/16.
 */
public class Combinations {

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        helper(path, 1, n, k, res);

        return res;
    }

    private void helper(List<Integer> path, int start, int n, int k, List<List<Integer>> res) {
        if (path.size() == k) {
            res.add(path);
            return;
        }

        if (path.size() > k)
            return;

        for (int i = start; i <= n; ++i) {
            path.add(i);
            helper(path, i, n, k, res);
            path.remove(path.size()-1);
        }
    }


}
