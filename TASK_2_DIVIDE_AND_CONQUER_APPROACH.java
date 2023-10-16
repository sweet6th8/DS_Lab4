package lab4_sorting;

import java.util.Arrays;

public class TASK_2_DIVIDE_AND_CONQUER_APPROACH {
	// Task 2.1: Implement merge sort algorithm to sort an array of integers.
	// sort by descending order

	public static void mergeSort(int[] array) {

		if (array.length <= 1)
			return;

		int mid = array.length / 2;
		int[] arrLeft = new int[mid];
		int[] arrRight = new int[array.length - mid];
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (i < mid) {
				arrLeft[i] = array[i];
			} else {
				arrRight[j++] = array[i];
			}
		}
		mergeSort(arrLeft);
		mergeSort(arrRight);

		merge(arrLeft, arrRight, array);

	}

	public static int[] merge(int[] arrLeft, int[] arrRight, int[] array) {
		int n = arrLeft.length;
		int m = arrRight.length;
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < n && j < m) {
			if (arrLeft[i] < arrRight[j]) {
				array[k++] = arrLeft[i++];

			} else {
				array[k++] = arrRight[j++];

			}

		}

		while (i < n) {
			array[k++] = arrLeft[i++];
		}
		while (j < m) {
			array[k++] = arrRight[j++];
		}
		return array;

	}

	// sort by ascending order
	public static void quickSort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	public static void quickSort(int[] array, int start, int end) {
		if (start >= end)
			return;
		int pivot = partition(array, start, end);
		quickSort(array, start, pivot - 1);
		quickSort(array, pivot + 1, end);

	}

	public static int partition(int[] array, int start, int end) {
		int pivot = array[end];
		int i = start - 1;
		for (int j = 0; j < end; j++) {
			if (array[j] < pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		i++;
		int temp = array[i];
		array[i] = array[end];
		array[end] = temp;
		return i;
	}

	// select pivot element based on the median of three strategy
	private static int getPivot_MedianOfThree(int[] array) {
		
		return 0;
	}

	// select pivot element based on the first element in the array
	private static int getPivot_First(int[] array) {
		// TODO
		return array[0];
	}

	// select pivot element based on the last element in the array
	private static int getPivot_Last(int[] array) {
		// TODO
		return array[array.length-1];
	}

	// select pivot element based on choosing a randomly element in the array
	private static int getPivot_Random(int[] array) {
		// TODO
		return 0;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 1, 2, 1, 3, 4 };
		mergeSort(arr);
		System.out.println(Arrays.toString(arr));
		quickSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
