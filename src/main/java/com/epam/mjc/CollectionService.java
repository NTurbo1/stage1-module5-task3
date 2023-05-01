package com.epam.mjc;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max(Comparator.<Integer>naturalOrder());
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream().flatMap(l -> l.stream()).min(Comparator.<Integer>naturalOrder());
    }

    public Integer sum(List<Integer> list) {
        return list.stream().reduce(0, (sum, num) -> sum + num);
    }
}
