package practise_zAdvance;

import java.util.ArrayList;

public class Data_Structure_ArrayList2 {

	public static void main(String[] args) {
		ArrayList <Integer> numbers = new ArrayList<Integer>();
		int SIZE = 1000000;
		numbers.ensureCapacity(SIZE);	//to store a big number of elements, use ensureCapacity to reserve spaces for them (ensure that it can hold at least the number of elements specified)
		System.out.println("Number of elements is " + numbers.size());	

		for (int i = 0; i < SIZE; i++) {
			numbers.add(i);
		}

		numbers.trimToSize();	// Shrink the capacity of this ArrayList instance to be the list’s current size
		System.out.println("Number of elements is " + numbers.size());
	}
}