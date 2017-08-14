package com.dewaldv.kata02;

import java.util.List;

public class KarateChop {

    public int chop(int searchValue, List<Integer> integerList) {
        return chopInt(searchValue, 0, integerList.size() - 1, integerList);
    }

    private int chopInt(int searchValue, int start, int end, List<Integer> integerList) {
        if (end < start) {
            return -1;
        }

        int middleIndex = (start + end) / 2;
        int middleValue = integerList.get(middleIndex);

        if (middleValue == searchValue) {
            return middleIndex;
        } else if (searchValue > middleValue){
            return chopInt(searchValue, middleIndex + 1, end, integerList);
        } else {
            return chopInt(searchValue, start, middleIndex - 1, integerList);
        }
    }
}
