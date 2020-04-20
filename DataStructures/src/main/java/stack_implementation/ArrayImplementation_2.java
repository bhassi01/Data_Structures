package stack_implementation;

public class ArrayImplementation_2 {

	int[] a;
	int size;
	int top;

	ArrayImplementation_2(int no) {
		this.size = no;
		this.a = new int[no];
		top = -1;
	}

	public boolean Is_Empty() {

		return top == -1;
	}

	public boolean Is_Full() {
		return top == size - 1;
	}

	public void push(int n) {
		if (!Is_Full()) {
			++top;
			a[top] = n;
			System.out.println("Adding value----" + n + "at index" + top);
		} else
			System.out.println("Stack is full");
	}

	public void peek() {
		if (!Is_Empty()) {
			System.out.println(a[top]);
		} else
			System.out.println("stack is already empty");
	}

	public void pop() {
		if (!Is_Empty()) {

			System.out.println("Popped element is" + a[top]);
			--top;
		} else
			System.out.println("Stack is already empty");
	}

	public static void main(String args[]) {
		ArrayImplementation_2 ar = new ArrayImplementation_2(5);
		ar.push(5);
		ar.push(10);
		ar.peek();
		ar.pop();
		ar.peek();
		ar.pop();
		ar.pop();
		ar.push(9);
		ar.peek();
		ar.pop();

	}
}
