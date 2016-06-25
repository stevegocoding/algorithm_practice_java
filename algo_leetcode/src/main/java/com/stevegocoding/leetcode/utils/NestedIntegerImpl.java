package com.stevegocoding.leetcode.utils;

import java.util.List;

/**
 * Created by magkbdev on 6/18/16.
 */
public class NestedIntegerImpl implements NestedInteger {

    private Integer value;
    private List<NestedInteger> children;

    public NestedIntegerImpl(Integer value) {
        this.value = value;
        this.children = null;
    }

    public NestedIntegerImpl(List<NestedInteger> children) {
        this.value = null;
        this.children = children;
    }

    @Override
    public boolean isInteger() {
        return value != null;
    }

    @Override
    public Integer getInteger() {
        return this.value;
    }

    @Override
    public List<NestedInteger> getList() {
        return children;
    }
}
