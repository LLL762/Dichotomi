package com.example.dicho;

public class Main {

	public static void main(String[] args) {

		final Finder finder = new Finder();
		final int[] ints = { -2, -1, 0, 13, 24, 37, 44, 56, 99, 117 };

		System.out.println(finder.find(ints, -2));
		System.out.println(finder.find(ints, -1));
		System.out.println(finder.find(ints, 0));
		System.out.println(finder.find(ints, 13));
		System.out.println(finder.find(ints, 24));

		System.out.println(finder.find(ints, 37));
		System.out.println(finder.find(ints, 44));
		System.out.println(finder.find(ints, 56));
		System.out.println(finder.find(ints, 99));
		System.out.println(finder.find(ints, 117));

	}

}
