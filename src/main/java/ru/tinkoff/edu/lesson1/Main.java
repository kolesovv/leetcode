package ru.tinkoff.edu.lesson1;

//Квадратичные сортировки

import java.util.Arrays;
import ru.tinkoff.edu.util.ArrayGenerator;

public class Main {

  public static void main(String[] args) {

    int[] array = ArrayGenerator.generateIntegerArray(-100, 100, 10);

    selectionSort(array);
    insertionSort(array);
    bubbleSort(array);
  }

  // Сортировка выбором
  public static void selectionSort(int[] array) {

    for (int i = 0; i < array.length; i++) {
      int index = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[index]) {
          index = j;
        }
      }
      if (index != i) {
        int min = array[index];
        array[index] = array[i];
        array[i] = min;
      }
    }

    System.out.println("Selection sort: " + Arrays.toString(array));
  }

  // Сортировка вставками
  public static void insertionSort(int[] array) {

    for (int i = 1; i < array.length - 1; i++) {
      int current = array[i];
      int j = i - 1;
      while (j >= 0 && current < array[j]) {
        array[j + 1] = array[j];
        j--;
      }
      array[j + 1] = current;
    }

    System.out.println("Insertion sort: " + Arrays.toString(array));
  }

  // Пузырьковая сортировка
  public static void bubbleSort(int[] array) {

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j + 1];
          array[j + 1] = array[j];
          array[j] = temp;
        }
      }
    }

    System.out.println("Bubble sort: " + Arrays.toString(array));
  }
}
