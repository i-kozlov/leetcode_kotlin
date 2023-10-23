package leetcode.problem601_699;

import java.util.*;

public class Java692 {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        Arrays.asList(words).forEach(w -> {
            map.put(w, map.getOrDefault(w, 0) + 1);
        });

        Comparator<Map.Entry<String, Integer>> comparator = (a, b) -> {
            if (a.getValue().equals(b.getValue())) {
                return b.getKey().compareTo(a.getKey());
            } else {
                return a.getValue() - b.getValue();
            }
        };
        Queue<Map.Entry<String, Integer>> heap = new PriorityQueue<>(comparator);

        map.entrySet().forEach(e -> {
            if (heap.size() < k) {
                heap.add(e);
            } else {
                if (comparator.compare(e, heap.peek()) > 0)  {
                    heap.poll();
                    heap.add(e);
                }
            }
        });

        List<String> list = new ArrayList<>();
        while (!heap.isEmpty()) {
            list.add(heap.poll().getKey());
        }

        return list;
    }
}
