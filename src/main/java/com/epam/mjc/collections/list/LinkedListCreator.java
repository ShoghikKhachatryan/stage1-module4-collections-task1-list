package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> temp = new LinkedList<>();
        for (Integer i : sourceList) {
            if (isOdd(i)) {
               temp.addFirst(i);
            } else {
                temp.addLast(i);
            }
        }

        return temp;
    }

    private boolean isOdd(Integer num) {
        return (0 != num % 2);
    }
}
