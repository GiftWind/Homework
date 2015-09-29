package MyStack;

public class MyStack<T> {

	private int size;

	private Node peek;

	private class Node {
		private T element;
		private Node next;
	}

	public MyStack() {}
	
	public MyStack<T> push(T element){
		Node current = peek;
		peek = new Node();
		peek.element = element;
		peek.next = current;
		size++;
		return this;
	}
	
	public T pop(){
		if (peek == null) new java.util.NoSuchElementException();
		T ele = peek.element;
		peek = peek.next;
		size--;
		return ele;
	}

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		Node tmp = peek;
		while (tmp != null) {
			sb.append(tmp.element).append(", ");
			tmp = tmp.next;
		}
		return sb.toString();
	}
	
}
