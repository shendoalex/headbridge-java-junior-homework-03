package ru.shendo.homework03.easy.exercise02;

import java.util.Arrays;

/*
Сортировка массива методом вставки по убыванию
 */

public class Task {
    public static void main(String[] args) {
        int[] array = {-2, 5, 1, -9, 0, 2, 5, 1, 8, 10};
        System.out.println(Arrays.toString(insertionSortBackwards(array)));
    }

    public static int[] insertionSortBackwards(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int number = array[left];
            int i;
            for (i = left - 1; i >= 0; i--) {
                if (number > array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = number;
        }
        return array;
    }
}