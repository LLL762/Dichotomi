package com.example.dicho;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FinderTestIT {

	private final Finder finder = new Finder();
	private final int[] arrayToTest = { -2, -1, 0, 13, 24, 37, 44, 56, 99, 117 };

	@Test
	void test() {

		final int expectedResult = 3;
		final int intToTest = 13;

		final int actualResult = finder.find(arrayToTest, intToTest);

		assertThat(actualResult).isEqualTo(expectedResult);

	}

	@Test
	void test5() {

		final int expectedResult = 5;
		final int intToTest = 37;

		final int actualResult = finder.find(arrayToTest, intToTest);

		assertThat(actualResult).isEqualTo(expectedResult);

	}

	@Test
	void test2() {

		final int expectedResult = 0;
		final int intToTest = -2;

		final int actualResult = finder.find(arrayToTest, intToTest);

		assertThat(actualResult).isEqualTo(expectedResult);

	}

	@Test
	void test3() {

		final int expectedResult = 9;
		final int intToTest = 117;

		final int actualResult = finder.find(arrayToTest, intToTest);

		assertThat(actualResult).isEqualTo(expectedResult);

	}

	@Test
	void test4() {

		final int expectedResult = -1;
		final int intToTest = 34;

		final int actualResult = finder.find(arrayToTest, intToTest);

		assertThat(actualResult).isEqualTo(expectedResult);

	}

	@Test
	void test6() {

		final int expectedResult = -1;
		final int intToTest = 789;

		final int actualResult = finder.find(arrayToTest, intToTest);

		assertThat(actualResult).isEqualTo(expectedResult);

	}

}
