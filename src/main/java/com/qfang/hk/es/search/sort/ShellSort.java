package com.qfang.hk.es.search.sort;

public class ShellSort {

   /* public static void shellSort(int a[]) {
        //从第gap个元素，逐个对其所在组进行直接插入排序操作
        for (int i = gap; i < arr.length; i++) {
            int j = i;
            int temp = arr[j];
            if (arr[j] < arr[j - gap]) {
                while (j - gap >= 0 && temp < arr[j - gap]) {
                    //移动法
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
            }
        }

    }*/

    public static void sort(int[] arr) {
        //增量gap，并逐步缩小增量
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            //从第gap个元素，逐个对其所在组进行直接插入排序操作
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                while (j - gap >= 0 && arr[j] < arr[j - gap]) {
                    //插入排序采用交换法
                    swap(arr, j, j - gap);
                    j -= gap;
                }
            }
        }
    }

    public static void shellMy(int a[]) {
        int length = a.length;
        while ((length = length / 2) != 0) {
            for (int i = length; i < a.length; i++) {
                int j = i;
                while (j - length >= 0 && a[j] > a[j - length]) {
                    int temp = a[j];
                    a[j] = a[j - length];
                    a[j - length] = temp;
                    j -= length;
                }
                ;
            }
        }

    }

    /**
     * 60      * 交换数组元素
     * 61      * @param arr
     * 62      * @param a
     * 63      * @param b
     * 64
     */
    public static void swap(int[] arr, int a, int b) {
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }

    public static void main(String[] args) {
        int[] a = {1, 10, 3, 5, 2, 0};  //第一次  1，3，2，0，5
        shellMy(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
