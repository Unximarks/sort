package com.qfang.hk.es.search.sort;

public class SelctionSort {

    public static void selctionSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int temp = a[i];
            int index = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < temp) {
                    temp = a[j];
                    index = j;
                }
            }
            a[index] = a[i];
            a[i] = temp;
        }
    }


    public static void main(String[] args) {
        int[] a = {1, 10,3, 5, 2, 0};  //第一次  1，3，2，0，5
        selctionSort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
