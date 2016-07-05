package com.stevegocoding.leetcode;

import java.util.Arrays;

/**
 * Created by magkbdev on 6/25/16.
 */
public class MatrixMultiplication {

    int[][] multiply(int[][] mat1, int[][] mat2) {
        int m = mat1.length;
        int n = mat1[0].length;
        int p = mat2.length;

        int[][] res = new int[m][p];
        for (int r = 0; r < m; ++r) {
            Arrays.fill(res[r], 0);
        }

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                for (int k = 0; k < p; ++k) {
                    res[i][k] += mat1[i][j] * mat2[j][k];
                }
            }
        }

        return res;
    }
}
