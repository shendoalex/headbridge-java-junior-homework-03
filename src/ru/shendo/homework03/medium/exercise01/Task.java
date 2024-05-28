package ru.shendo.homework03.medium.exercise01;

/*
Найти число в неупорядоченном массиве, используя бинарный поиск и сортировку массива пузырьком.
Если число найдено, вернуть число, если не найдено, вернуть -1.
Массив состоит из неотрицательных чисел.
 */

public class Task {
    public static void main(String[] args) {
        int[] array = {1, 9, 6, 2, 5, 7, 8};
        System.out.println(customSearchForNumber(array, 5));
        System.out.println(customSearchForNumber(array, 3));
    }

    public static int customSearchForNumber(int[] unsortedArray, int target) {
        int[] array = unsortedArray.clone();
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        int leftPointer = 0;
        int rightPointer = array.length - 1;
        return recursionBinarySearch(array, target, leftPointer, rightPointer);
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