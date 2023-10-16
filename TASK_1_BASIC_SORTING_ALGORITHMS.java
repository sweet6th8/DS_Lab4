package lab4_sorting;

import java.util.Arrays;
import java.util.Iterator;

public class TASK_1_BASIC_SORTING_ALGORITHMS {
	// Task 1.1: Implement selection sort algorithm to sort an array of integers
	// (using iterative or recursive approach).
	// sort by descending order

	public static void selectionSort(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			int max_index = i;
			for (int j = i + 1; j < n; j++) {
				if (array[j] > array[max_index]) {
					max_index = j;
				}

			}

			int temp = array[max_index];
			array[max_index] = array[i];
			array[i] = temp;

		}
		System.out.println(Arrays.toString(array));
	}

	// Task 1.2: Implement bubble sort algorithm to sort an array of integers (using
	// iterative or recursive approach).
	// sort by descending order
	public static void bubbleSort(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] < array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}

	// Task 1.3: Implement insertion sort algorithm to sort an array of integers
	// (using iterative or recursive approach).
	public static void insertionSort(int[] array) {
		int n = array.length;
		for (int i = 1; i < n; i++) {
			int key = array[i];
			int j = i-1;
			while(j>=0 && array[j]<key) {
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=key;
		}
		System.out.println(Arrays.toString(array));
		}


	public static void main(String[] args) {
		int[] arr = { 5, 1, 2, 1, 8, 3 };
		selectionSort(arr);
		bubbleSort(arr);
		insertionSort(arr);
		

	}
}
