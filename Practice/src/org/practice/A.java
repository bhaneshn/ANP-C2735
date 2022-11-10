package org.practice;

public class A {
	
	public static void main(String s[]) {

		A ref1 = new A(10);

		A ref2;

		ref2 = ref1.inc();

		System.out.println(ref1.a);

		System.out.println(ref2.a);

		ref2 = ref1.inc();

		System.out.println(ref2.a);

		}
	int a;

	A(int i) {

	a = i;

	}

	A inc( ) {

	A temp = new A(a+10);

	return temp;

	}

	}

	class TestQuestion {

	

}
