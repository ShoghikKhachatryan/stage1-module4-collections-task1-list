package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aInt = Integer.parseInt(a);
        int aSum = 5 * aInt * aInt + 3;
        int bInt = Integer.parseInt(b);
        int bSum = 5 * bInt * bInt + 3;
        if (aSum > bSum) {
            return 1;
        } else if (aSum == bSum) {
            return Integer.compare(aInt, bInt);
        } else {
            return -1;
        }
    }
}
