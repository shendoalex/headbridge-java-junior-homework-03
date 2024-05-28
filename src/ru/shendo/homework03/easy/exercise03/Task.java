package ru.shendo.homework03.easy.exercise03;

/*
Вывести индекс числа в неупорядоченном массиве с использованием линейного поиска.
Если число не найдено, выводим -1.
 */

public class Task {
    public static void main(String[] args) {
        int[] array = {-2, 5, 1, -9, 0, 2, 5, 1, 8, 10};
        System.out.println(linearSearchForElementFirstOccurrence(array, 2));
        System.out.println(linearSearchForElementFirstOccurrence(array, 7));
    }

    public static int linearSearchForElementFirstOccurrence(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
