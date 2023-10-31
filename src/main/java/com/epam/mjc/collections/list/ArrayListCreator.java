package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> duplicated = new ArrayList<>();

        for (int i = 1; i <= sourceList.size(); i++) {
            if (i % 3 == 0) {
                String word = sourceList.get(i - 1);
                duplicated.add(word);
                duplicated.add(word);
            }
        }

        return duplicated;
    }
}
