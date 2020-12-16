package com.qfang.hk.es.search.sort;

public class InsertionSort {
    /**
     * @param a
     */
    public static void insertionSort(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            for (int j = i - 1; j >= 0; j--) {
                if (temp > a[j]) {
                    a[j + 1] = temp;
                    break;
                }
                a[j + 1] = a[j];
                if (j == 0) {
                    a[0] = temp;
                }
            }

        }
    }

    public static void Isertion(int[] arr) {
        for (int key = 1; key < arr.length; key++) {
            int temp;
            for (int i = key; i > 0; i--) {
                if (arr[i] < arr[i - 1]) {
                    temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void insertionSort1(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i;
            while (j >= 0 && arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }

        }
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 3, 5, 2, 0};  //第一次  1，3，2，0，5
        insertionSort1(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
