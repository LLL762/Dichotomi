package com.example.dicho;

public class Finder {

	public int find(final int[] input, final int intToFind) {

		int median = 0;
		int diff = 0;

		if (input.length == 0) {
			return -1;
		}

		if (input.length <= 1) {

			return input[0] == intToFind ? 0 : -1;

		}

		median = Utility.getMedian(input.length) - 1;
		diff = intToFind - input[median];

		switch ((int) Math.signum(diff)) {

		case 0: {

			return median;
		}

		case 1: {

			diff = find(Utility.splitArray(input, median + 1, input.length - 1), intToFind);

			if (diff == -1) {
				return -1;
			}

			median += diff + 1;
			return median;

		}
		case -1: {

			diff = find(Utility.splitArray(input, 0, median - 1), intToFind);

			if (diff == -1) {
				return -1;
			}

			median -= (median - diff);

			return median;

		}

		default:
			return -1;
		}

	}

}
