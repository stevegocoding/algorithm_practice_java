package com.stevegocoding.leetcode;

/**
 Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.

 For example,
 MovingAverage m = new MovingAverage(3);
 m.next(1) = 1
 m.next(10) = (1 + 10) / 2
 m.next(3) = (1 + 10 + 3) / 3
 m.next(5) = (10 + 3 + 5) / 3
 */

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {

    private Queue<Integer> queue;
    private int windowSize;

    public MovingAverage(int size) {
        this.queue = new LinkedList<>();
        this.windowSize = size;
    }

    public double next(int val) {
        if (queue.size() < windowSize) {
            queue.offer(val);
        }
        else {
            queue.poll();
            queue.offer(val);
        }
        int sum = 0;
        for (Integer e : queue) {
            sum += e;
        }

        return (double)sum / queue.size();
    }
}

