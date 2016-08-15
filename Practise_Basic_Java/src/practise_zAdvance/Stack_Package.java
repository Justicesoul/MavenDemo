package practise_zAdvance;

import java.util.Stack;

public class Stack_Package {
	Stack<String> inside = new Stack<String>();

	public void PrintStack() {
		System.out.print("All items: [");
		while(!inside.empty()) {						// Tests if this stack is empty.
			System.out.print(inside.pop() + " ");	// Retrieve and remove the object at the top of this stack
			}
		System.out.println("]");
	}
 
	public void Find(String w) {
		int idx = inside.search(w);		// Find the position of an object in this stack
		if (idx < 0) {
			System.out.println(w + " not found in this stack");
		} else {
			System.out.println("Index of [" + w + "] is: " + idx);
		}
	}

	public void Add(String string) {
		inside.push(string);
		System.out.println(string + " is added");
	}

	public String ViewLastest() {
		return inside.peek();
	}
	
	
}
