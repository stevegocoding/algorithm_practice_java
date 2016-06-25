package com.stevegocoding.leetcode;

import java.util.*;

/**
 * Created by magkbdev on 6/24/16.
 */

class Entry {
    public int key;
    public int frequency;

    public Entry(int key, int frequency) {
        this.key = key;
        this.frequency = frequency;
    }
}

public class TopKFrequentElements {

    public List<Integer> topKFrequent(int[] nums, int k) {

        // Calculate the frequency
        Map<Integer, Integer> m = new HashMap<>();
        for (int n : nums) {
            if (m.containsKey(n)) {
                m.put(n, m.get(n) + 1);
            }
            else {
                m.put(n, 1);
            }
        }

        PriorityQueue<Entry> minHeap = new PriorityQueue<>(k, new Comparator<Entry>() {
            @Override
            public int compare(Entry o1, Entry o2) {
                return o1.frequency - o2.frequency;
            }});

        for (int key : m.keySet()) {
            Entry top = minHeap.peek();
            Entry newEntry = new Entry(key, m.get(key));

            if (minHeap.size() < k) {
                minHeap.add(newEntry);
            }
            else if (newEntry.frequency > top.frequency) {
                minHeap.poll();
                minHeap.add(newEntry);
            }
        }

        List<Integer> res = new ArrayList<>();
        while (minHeap.size() > 0) {
            res.add(minHeap.poll().key);
        }
        return res;
    }
}
