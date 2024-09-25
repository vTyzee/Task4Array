package org.example;

import java.util.Arrays;
import java.util.Random;

public class NumArray {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int number;
            do {
                number = random.nextInt(100);
            } while (number % 2 == 0);
            array[i] = number;
        }

        System.out.println("Несортированный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d ", array[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        Arrays.sort(array);

        System.out.println("\nОтсортированный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d ", array[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double) sum / array.length;

        System.out.println("\nСреднее арифметическое: " + average);
    }
}
