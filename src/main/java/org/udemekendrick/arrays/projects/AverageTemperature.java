package org.udemekendrick.arrays.projects;

import java.util.Scanner;

public class AverageTemperature {
    public void calculateAverageTemperature() {
        Scanner console = new Scanner(System.in);
        System.out.print("How many days' temperature? : ");
        int numOfDays = console.nextInt();
        int[] temp = new int[numOfDays];
        int sum = 0;
        for (int i = 0; i < numOfDays; i++) {
            System.out.print("Day " + (i + 1) + "'s high temperature: ");
            temp[i] = console.nextInt();
            sum += temp[i];
        }
        double average = sum / numOfDays;
        int above = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > average) {
                above++;
            }
        }
        System.out.println();
        System.out.print("Average temperature = " + average);
        System.out.println();
        System.out.println(above + " days is above temperature");
    }
}
