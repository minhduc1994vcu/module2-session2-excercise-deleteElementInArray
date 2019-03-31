package com.codegym.delete;

import java.util.Scanner;

public class DeleteElementsInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {3, 5, 7, 11, 13, 1, 15, 17, 19};
        showArray(array);
        System.out.print("\n" + "enter a value which you wanna delete: ");
        int number = scanner.nextInt();
        boolean check = false;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                check = true;
                index = i;
                break;
            }
        }
        if (check) {
            System.out.println(number + " was found in the array");
            delete(array, index);
            System.out.println("array after deleted");
            showArray(array);
        } else {
            System.out.println(number + " was not found in the array");
        }
    }

    private static void delete(int[] arr, int index) {
        if (arr.length - 1 - index >= 0) System.arraycopy(arr, index + 1, arr, index, arr.length - 1 - index);
        arr[arr.length-1] = 0;
    }

    private static void showArray(int[] arr) {
        System.out.print("array: ");
        for (int i1 : arr) {
            System.out.print(i1 + "\t");
        }
    }
}