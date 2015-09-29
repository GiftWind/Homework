package MyStack;

public class UsingMyStack {

	public static void main(String[] args) {

		MyStack<String> testStack = new MyStack<String>();
		testStack.push("Hello, ").push("World").push("!");
		System.out.println(testStack.pop() + testStack.pop() + testStack.pop());
		testStack.pop();
	}

}
