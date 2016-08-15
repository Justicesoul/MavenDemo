package practise_zAdvance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Data_Structure_ArrayList {
	public static void printList(List<String> words){
		for (int i = 0; i < words.size(); i++)		System.out.println("Words[" + i + "]: " + words.get(i));
		System.out.println("\n");
	}

	public static void printList2(List<String> words){
		Iterator<String> iterator = words.iterator();
		while (iterator.hasNext()) {
			String word = iterator.next();
			System.out.print(word + " ");
		}
		System.out.println("\n");
	}

	public static void printList3(List<String> words) {
		for(String word : words)		System.out.print(word + " ");
		System.out.println("\n");
	}
	
	
	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();

		words.add("school");
		printList2(words);

		words.add(0, "at");
		System.out.println(">> Insert via index");
		printList2(words);

		words.set(1, "work");
		System.out.println(">> Update via index");
		printList2(words);

		words.remove(0);
		System.out.println(">> Remove via index");
		printList2(words);
	}

}
