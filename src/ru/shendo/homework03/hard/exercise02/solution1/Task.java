package ru.shendo.homework03.hard.exercise02.solution1;

import java.util.Arrays;

/*
Найти индекс числа в исходном неупорядоченном массиве, используя бинарный поиск.
Подсказка: необходимо придумать способ сохранения исходного индекса для каждого числа
в отсортированном массиве, т.к. при сортировке индексы изменятся.
 */


public class Task {

    public static void main(String[] args) {
        int[] array = {1, 9, 6, 2, 5, 7, 8};
        System.out.println(searchForANumber(array, 5));
        System.out.println(searchForANumber(array, 3));
        System.out.println(searchForANumber(array, 9));
    }

    public static int searchForANumber(int[] unsortedArray, int number) {
        NumberAndIndexNode[] arrayOfPairs = new NumberAndIndexNode[unsortedArray.length];
        for (int i = 0; i < unsortedArray.length; i++) {
            arrayOfPairs[i] = new NumberAndIndexNode(unsortedArray[i], i);
        }
        Arrays.sort(arrayOfPairs);
        int leftPointer = 0;
        int rightPointer = unsortedArray.length - 1;
        return recursionBinarySearch(arrayOfPairs, number, leftPointer, rightPointer);
    }

    private static int recursionBinarySearch(NumberAndIndexNode[] array, int target, int leftPointer, int rightPointer) {
        int middleIndex = (leftPointer + rightPointer) / 2;
        if (leftPointer > rightPointer) {
            return -1;
        } else if (target == array[middleIndex].getNUMBER()) {
            return array[middleIndex].getINDEX();
        } else if (target > array[middleIndex].getNUMBER()) {
            return recursionBinarySearch(array, target, middleIndex + 1, rightPointer);
        } else {
            return recursionBinarySearch(array, target, leftPointer, middleIndex - 1);
        }
    }

}
