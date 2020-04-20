package stack_implementation;

import java.util.Scanner;

public class Arrayimplementation {

	static int[] aray = new int[10];
	static int current_capacity;

	public static void initialise(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			ar[i] = -1;
		}
	}

	public static int check_capacity() {
		for (int i = 0; i < aray.length; i++) {
			if (!(aray[i] == -1)) {
				++current_capacity;
			}
		}
		return current_capacity;
	}

	public static void push( int n) {

		if ((current_capacity == aray.length)) {
//			System.out.println("Enter the data");
//			Scanner Next = new Scanner(System.in);
//			int k = Next.nextInt();
			System.out.println("Array index is out of bounds ");
			
		} else {
			int m = current_capacity;
		    aray[m ] = n;
		    ++current_capacity;}
			}

	public static void pop() {
		if (current_capacity == 0) {
			System.out.println("Array is empty ");
			
		} else {
		int m = current_capacity-1;
		System.out.println("Deleting element-->" +aray[m]);
		aray[m] = -1;
		print();
		-- current_capacity;
		if (current_capacity == 0) {
			System.out.println("Array is empty ");}
		}
			
	}

	public static void peek(int i) {
		if (i <=current_capacity && !(aray[i]==-1)) {
			System.out.println(aray[i]);
		} else
			System.out.println("Element is out of bounds for the index--->" + i);
	}
	
	public static void print()
	{
		for(int i=0;i<=current_capacity;i++)
		{
			if(!(aray[i]==-1))
			System.out.println(aray[i]);
		}
	}

	public static void main(String args[]) {
		System.out.println("Main method started");
		initialise(aray);
		System.out.println("current capacity is---->"+current_capacity);
		push(9);
		System.out.println("current capacity is---->"+current_capacity);
		push(10);
		push(1);
		push(5);
		System.out.println("current capacity is---->"+current_capacity);
		print();
		peek(3);
		pop();
		pop();pop();
		pop();
		System.out.println(current_capacity);
		
		
		
	}

}
