package com.csi.jdkfeatures;

interface Add {
	void add(int n1, int n2);

	default void m1() {
		System.out.println("default method");
	}

	static void m2() {
		System.out.println("static method");
	}

}

public class LambdaExpression {
	public static void main(String[] args) {

		Add a1 = (n1, n2) -> {
			System.out.println(n1 + n2);
			System.out.println(n1 - n2);
			System.out.println(n1 * n2);
		};

		a1.add(200, 29);
		a1.add(899, 678);
		a1.m1();
		Add.m2();

	}
}
