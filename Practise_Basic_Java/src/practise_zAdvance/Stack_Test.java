package practise_zAdvance;

public class Stack_Test {
	public static void main(String []args) {
		Stack_Package outsite = new Stack_Package();
		outsite.Add("Thinh");
		outsite.Add("Jack");
		outsite.Add("Soul");
		
		System.out.println("\nThe first item is: " + outsite.ViewLastest());
		outsite.Find("Thinh");
		outsite.PrintStack();
		outsite.Find("Thinh");
	}
}
