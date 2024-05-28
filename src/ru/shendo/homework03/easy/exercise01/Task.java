package ru.shendo.homework03.easy.exercise01;

import java.util.Arrays;

/*
Сортировка массива методом выбора natural order.
 */

public class Task {
    public static void main(String[] args) {
        int[] array = {-2, 5, 1, -9, 0, 2, 5, 1, 8, 10};
        System.out.println(Arrays.toString(selectionSort(array)));
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        return array;
    }
}
