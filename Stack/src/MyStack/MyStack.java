package MyStack;

public class MyStack<T> {

	private int size;

	private Node<T> peek;
	
	public MyStack() {}
	
	public MyStack<T> push(T element){
		Node<T> current = peek;
		peek = new Node<T>();
		peek.element = element;
		peek.next = current;
		size++;
		return this;
	}
	
	public T pop() throws NullPointerException{
		if (peek == null) new NullPointerException();
		T element = peek.element;
		peek = peek.next;
		size--;
		return element;
	}

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		Node<T> temp = peek;
		while (temp != null) {
			sb.append(temp.element).append(", ");
			temp = temp.next;
		}
		return sb.toString();
	}
	
}
