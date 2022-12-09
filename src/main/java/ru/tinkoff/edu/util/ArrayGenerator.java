package ru.tinkoff.edu.util;

import java.util.Arrays;
import java.util.Random;

public class ArrayGenerator {

  private static final Random RANDOM = new Random();

  private ArrayGenerator() {

  }

  public static int[] generateIntegerArray(int minValue, int maxValue, int size) {

    int[] array = new int[size];

    for (int i = 0; i < array.length; i++) {
      array[i] = minValue + RANDOM.nextInt(maxValue - minValue + 1);
    }

    System.out.println("Generated array: " + Arrays.toString(array) + "\n");
    return array;
  }
}
