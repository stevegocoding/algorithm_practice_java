package com.stevegocoding.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by magkbdev on 6/20/16.
 */
public class FlipGame {

    public List<String> generatePossibleNextMoves(String s) {

        List<String> res = new ArrayList<>();

        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) == '+' && s.charAt(i-1) == '+') {
                res.add(s.substring(0, i - 1) + "--" + s.substring(i + 1, s.length()));
            }
        }

        return res;
    }
}
