package com.insertionSort;

public class InsertionSort {

    // Funkcja wykonujaca insertion sort na tablicy
    public static void insertionSort(int[] arr) {

        //Zaczyna sie od 2 elementu, dzielimy tablice na dwa subsety
        //w pierwszej iteracji 1 subset to tylko element na index[0], a 2 to reszta tablicy
        //element na indeksie 0 jest juz posortowany
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > value) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = value;
        }
    }
}
