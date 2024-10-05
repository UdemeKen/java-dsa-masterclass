package org.udemekendrick;

import org.udemekendrick.arrays.SingleDimensionalArray;

public class Main {
    public static void main(String[] args) {
        SingleDimensionalArray array = new SingleDimensionalArray(5);
        array.insert(0, 1);
        array.insert(1, 2);
        array.insert(2, 3);
        array.insert(1, 4);
        array.insert(10, 5);

        System.out.println("Search in array!");
        array.searchInArray(10);
    }
}