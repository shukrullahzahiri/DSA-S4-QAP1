package com.keyin;

import java.util.Scanner;

public class Arrays {

    // Method to calculate the average of 5 temperatures
    public static double getAverageTemp(double[] temps) {
        double sum = 0;
        for (double temp : temps) {
            sum += temp;
        }
        return sum / temps.length;
    }

    // Method to count how many temperatures are above the average
    public static int countAboveAverage(double average, double[] temps) {
        int count = 0;
        for (double temp : temps) {
            if (temp > average) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        double[] temperatures = new double[5];

        // Taking 5 temperature inputs from the user
        System.out.println("Please enter 5 temperature values:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Temperature " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        // Calculate the average temperature
        double averageTemp = getAverageTemp(temperatures);

        // Print the average temperature
        System.out.println("\nAverage Temperature: " + averageTemp);

        // Count and print how many temperatures are above the average
        int aboveAverageCount = countAboveAverage(averageTemp, temperatures);
        System.out.println("Number of temperatures above the average: " + aboveAverageCount);
    }
}
