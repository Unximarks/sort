package com.qfang.hk.es.search.sort;

public class BubbleSort {

    public static void bubbleSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 10,3, 5, 2, 0};  //第一次  1，3，2，0，5
        bubbleSort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
