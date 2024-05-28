package ru.shendo.homework03.hard.exercise01;

import java.util.Arrays;

/*
Найти число в неупорядоченном массиве, используя бинарный поиск.
Если число найдено, вернуть число, если число не найдено, вернуть -1.
Массив состоит из неотрицательных чисел. Сложность решения должна быть не больше, чем О(n*log(n)).
 */

public class Task {
    public static void main(String[] args) {
        int[] array = {1, 9, 6, 2, 5, 7, 8};
        System.out.println(searchForANumber(array, 5));
        System.out.println(searchForANumber(array, 3));
    }

    public static int searchForANumber(int[] unsortedArray, int number) {
        int[] array = unsortedArray.clone();
        // сложность О(log(n))
        Arrays.sort(array);
        int leftPointer = 0;
        int rightPointer = array.length - 1;
        // сложность О(log(n))
        return recursionBinarySearch(array, number, leftPointer, rightPointer);
    }

    private static int recursionBinarySearch(int[] array, int target, int leftPointer, int rightPointer) {
        int middleIndex = (leftPointer + rightPointer) / 2;
        if (leftPointer > rightPointer) {
            return -1;
        } else if (target == array[middleIndex]) {
            return array[middleIndex];
        } else if (target > array[middleIndex]) {
            return recursionBinarySearch(array, target, middleIndex + 1, rightPointer);
        } else {
            return recursionBinarySearch(array, target, leftPointer, middleIndex - 1);
        }
    }
}

