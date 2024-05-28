package ru.shendo.homework03.hard.exercise02.solution2;

import java.util.TreeMap;

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
        System.out.println(searchForANumber(array, 7));
    }

    public static int searchForANumber(int[] unsortedArray, int number) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < unsortedArray.length; i++) {
            treeMap.put(unsortedArray[i], i);
        }
        int leftPointer = treeMap.firstKey();
        int rightPointer = treeMap.lastKey() - 1;
        System.out.println(treeMap);
        return recursionBinarySearch(treeMap, number, leftPointer, rightPointer);
    }

    private static int recursionBinarySearch(TreeMap<Integer, Integer> treeMap, int target, int leftPointer, int rightPointer) {
        int middleIndex = (leftPointer + rightPointer) / 2;
        if (leftPointer > rightPointer) {
            return -1;
        } else if (target == (Integer) treeMap.keySet().toArray()[middleIndex]) {
            return treeMap.get(target);
        } else if (target > (Integer) treeMap.keySet().toArray()[middleIndex]) {
            return recursionBinarySearch(treeMap, target, middleIndex + 1, rightPointer);
        } else {
            return recursionBinarySearch(treeMap, target, leftPointer, middleIndex - 1);
        }
    }

}
