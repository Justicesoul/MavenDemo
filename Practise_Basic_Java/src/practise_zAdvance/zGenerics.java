package practise_zAdvance;

import java.util.ArrayList;
import java.util.List;

public class zGenerics {
	public static <T> void printList(List<T> numbers) {
		for (T n : numbers) {
			System.out.println(n);
		} System.out.println("\n");
	}

	public static void printSquare(List<Number> numbers) {
		for (Number n : numbers) {
			double d = n.doubleValue();
			System.out.println(d * d);
		} System.out.println("\n");
	}

	public static void printSquare2(List<? extends Number> numbers) {
		for (Number n : numbers) {
			double d = n.doubleValue();
			System.out.println(d * d);
		} System.out.println("\n");
	}

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
		ints.add(3);
		printList(ints);
		printSquare2(ints);

		//Type Wildcard
		List<Double> doubles = new ArrayList<Double>();
		doubles.add(1.1);
		doubles.add(1.2);
		doubles.add(1.3);
		printList(doubles);
		printSquare2(doubles);


		//Generic Class
		zEntry<String, String> phone = new zEntry<String, String>("Alice", "123456789");
		zEntry<String, Integer> height = new zEntry<String, Integer>("Alice", 167);
		System.out.println("Phone number: " + phone);
		System.out.println("Height: " + height);

		zEntry<String, Boolean> isMarried = new zEntry<String, Boolean>("Alice", true);
		if (isMarried.getValue()) System.out.println(isMarried.getKey() + " is married.");
		else System.out.println(isMarried.getKey() + " is not married.");
	}
}
