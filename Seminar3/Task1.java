package Seminar3;

import java.lang.reflect.Array;
import javax.swing.text.html.StyleSheet;
//Реализовать алгоритм сортировки слиянием.

import java.util.*;


public class Task1 {
    public static void main(String[] args) {
        
        Random num = new Random();
        int[] unsortedArray = new int[30];

        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = num.nextInt(100);
        }
        System.out.printf("Исходный массив %s \n", Arrays.toString(unsortedArray));

        int[] resultArray = mergeSort(unsortedArray);
        System.out.printf("Отсортированный массив %s\n", Arrays.toString(resultArray));
    }

    public static int[] mergeSort(int[] array) {
        if (array.length < 2) return array;

        int[] bufOneArray = new int[array.length / 2];
        System.arraycopy(array, 0, bufOneArray, 0, array.length / 2);

        int [] bufTwoArray = new int[array.length - bufOneArray.length];
        System.arraycopy(array, array.length / 2, bufTwoArray, 0, array.length - bufOneArray.length);

        bufOneArray = mergeSort(bufOneArray);
        bufTwoArray = mergeSort(bufTwoArray);

        return mergeArray(bufOneArray, bufTwoArray);
    }


    public static int[] mergeArray(int[] bufOneArray, int[] arrayB) {
        int n1 = bufOneArray.length, n2 = arrayB.length;
        int n = n1 + n2, i1 = 0, i2 = 0;
        int[] resArray = new int[n];

        for (int i = 0; i < n; i++) {
            if (i1 == n1) {
                resArray[i] = arrayB[i2++];
            } else if (i2 == n2) {
                resArray[i] = bufOneArray[i1++];
            } else {
                if (bufOneArray[i1] < arrayB[i2]) {
                    resArray[i] = bufOneArray[i1++];
                } else {
                    resArray[i] = arrayB[i2++];
                }
            }
        }
        return resArray;
    }
    
    
}
