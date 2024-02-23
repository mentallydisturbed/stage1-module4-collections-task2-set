package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(Integer i : sourceList) {
            int j = i;
            while(j % 2 == 0) {
                hashSet.add(j);
                j /= 2;
            }
            hashSet.add(j);
            hashSet.add(j * 2);
        }
        return hashSet;
    }
}
