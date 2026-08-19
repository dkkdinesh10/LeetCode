package org.example.leetcode.alltopics.easy;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class P1941 {
    public boolean areOccurrencesEqual(String s) {
        Set<Long> collect = new HashSet<>(s.chars().mapToObj(x -> (char) x).collect
                        (Collectors.groupingBy(x -> (char) x, Collectors.counting()))
                .values());

        if(collect.size()>2)
            return false;
        else
            return true;
    }
}
