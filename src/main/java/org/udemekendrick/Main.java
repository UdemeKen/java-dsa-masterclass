package org.udemekendrick;

import org.udemekendrick.arrays.SingleDimensionalArray;
import org.udemekendrick.arrays.TwoDimensionalArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray(3, 3);
        twoDimensionalArray.insertValueInTheArray(0, 0, 10);
        twoDimensionalArray.insertValueInTheArray(0,1, 20);
        twoDimensionalArray.insertValueInTheArray(0,2, 30);
        twoDimensionalArray.insertValueInTheArray(1,0, 40);
        twoDimensionalArray.insertValueInTheArray(1,1, 50);
        twoDimensionalArray.insertValueInTheArray(1,2, 60);
        twoDimensionalArray.insertValueInTheArray(2,0, 70);
        twoDimensionalArray.insertValueInTheArray(2,1, 80);
        twoDimensionalArray.insertValueInTheArray(2,2, 90);

        System.out.println(Arrays.deepToString(twoDimensionalArray.arr));
        twoDimensionalArray.deleteValueFromArray(1, 1);
        System.out.println(Arrays.deepToString(twoDimensionalArray.arr));
    }
}
