package com.example.dicho;

public class Utility {

	private Utility() {

	}

	public static int[] splitArray(final int[] input, final int start, final int end) {

		final int[] output = new int[end - start + 1];

		for (int i = start; i <= end; i++) {

			output[i - start] = input[i];

		}

		return output;
	}

	public static int getMedian(int input) {

		return (int) Math.ceil(((double) input) / 2);

	}

}