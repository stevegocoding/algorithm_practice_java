package com.stevegocoding.leetcode;

/**
 * Created by magkbdev on 6/16/16.
 */
public class ReverseString {
    public String reverseString(String s) {
        if (s.isEmpty()) {
            return "";
        }

        int i = 0;
        int j = s.length() - 1;
        char[] arr = s.toCharArray();
        while (i < j) {
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;

            i++;
            j--;
        }
        return String.valueOf(arr);
    }
}
