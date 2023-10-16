package lab4_sorting;

import java.util.Arrays;

public class Order {
	private OrderItem[] items;

	public Order(OrderItem[] items) {
		super();
		this.items = items;
	}


	
	public void selectionSort() {
		int n = items.length;
		for (int i = 0; i < n - 1; i++) {
			int max_index = i;
			for (int j = i + 1; j < n; j++) {
				if (items[j].compareTo(items[max_index])<0) {
					max_index = j;
				}

			}

			OrderItem temp = items[max_index];
			items[max_index] = items[i];
			items[i] = temp;

		}
		System.out.println(Arrays.toString(items));
	}
	
	public void bubbleSort() {
		int n = items.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (items[j].compareTo(items[j+1])>0) {
					OrderItem temp = items[j];
					items [j] = items[j + 1];
					items[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(items));
	}
	
	public void insertionSort() {
		int n = items.length;
		for (int i = 1; i < n; i++) {
			OrderItem key = items[i];
			int j = i-1;
			while(j>=0 && items[j].compareTo(key)>0) {
				items[j+1]=items[j];
				j--;
			}
			items[j+1]=key;
		}
		System.out.println(Arrays.toString(items));
		}
}
