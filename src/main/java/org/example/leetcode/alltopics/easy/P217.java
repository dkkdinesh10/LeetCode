package org.example.leetcode.alltopics.easy;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P217 {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3}));

        LinkedHashSet<String> set=new LinkedHashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("two");

        System.out.println(set);
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Map.Entry<Integer, Long>> collect = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(x -> x.getValue() > 1).collect(Collectors.toSet());
        return collect.size()==0?true:false;

    }
}
