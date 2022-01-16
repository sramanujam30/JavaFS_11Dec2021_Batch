import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> sset = new Stack<String>();
		sset.push("India");
		sset.push("Canada");
		sset.push("UK");
		sset.push("USA");
		sset.push("Australia");

		System.out.println("Content of Stack is: "+sset);
		System.out.println();
		String popped = sset.pop();
		System.out.println("Popped element is: "+popped);
		System.out.println("New content of Stack is: "+sset);
		System.out.println("Top most element is: " +sset.peek());
		sset.remove("USA");
		System.out.println("New content of Stack is: "+sset);
	}

}
