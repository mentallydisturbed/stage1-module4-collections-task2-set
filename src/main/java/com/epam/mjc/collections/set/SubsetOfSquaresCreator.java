package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(Integer i : sourceList) {
            treeSet.add(i * i);
        }
        Set<Integer> set = treeSet.subSet(lowerBound, upperBound + 1);
        return set;
    }
}
