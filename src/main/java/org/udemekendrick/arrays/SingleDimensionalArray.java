package org.udemekendrick.arrays;

/**
 * Author: Udeme Kendrick
 *
 * @version 1.0
 * @license MIT License
 * @see <a href="mailto:udemekendrick@gmail.com">udemekendrick@gmail.com</a>
 * @see <a href="https://udemekendrick.vercel.app">https://udemekendrick.vercel.app</a>
 * @since 10/4/2024
 */
public class SingleDimensionalArray {

    int[] arr = null;

    public SingleDimensionalArray (int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert (int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted!");
            } else {
                System.out.println("This cell is already occupied!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }
    }

    public void traverseArray() {
        try{
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exist!");
        }
    }

    public void searchInArray(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("Value found at the index of " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " value is not found!");
    }

    public void deleteElement(int indexValueOfElement) {
        try {
            arr[indexValueOfElement] = Integer.MIN_VALUE;
            System.out.println("Element of an array successfully deleted!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Element to be deleted is not found!");
        }
    }
}
