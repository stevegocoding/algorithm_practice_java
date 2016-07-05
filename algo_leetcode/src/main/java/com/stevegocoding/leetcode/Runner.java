package com.stevegocoding.leetcode;

import com.stevegocoding.leetcode.utils.TreeNode;

/**
 * Created by magkbdev on 6/25/16.
 */
public class Runner {

    private static GenerateAbbriviations generateAbbrs = new GenerateAbbriviations();
    private static MatrixMultiplication matMultiply = new MatrixMultiplication();
    private static BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();

    public static void main(String[] args) {
        runGenerateAbbrs();
    }

    private static void runGenerateAbbrs() {
        generateAbbrs.generateAbbrivations("word");
    }

}
