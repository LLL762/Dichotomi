package com.example.dicho;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FinderTestIT {

    private final Finder finder = new Finder();
    private final int[] arrayToTest = {-2, -1, 0, 13, 24, 37, 44, 56, 99, 117};

    @Test
    void test() {

        final int[] expectedResults = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        final int[] intsToTest = arrayToTest;

        for (int i = 0; i < intsToTest.length; i++) {

            final int actualResult = finder.find(arrayToTest, intsToTest[i]);

            assertThat(actualResult).isEqualTo(expectedResults[i]);
        }


    }


    @Test
    void test2() {

        final int expectedResult = -1;
        final int intToTest = 34;

        final int actualResult = finder.find(arrayToTest, intToTest);

        assertThat(actualResult).isEqualTo(expectedResult);

    }

    @Test
    void test3() {

        final int expectedResult = -1;
        final int intToTest = 789;

        final int actualResult = finder.find(arrayToTest, intToTest);

        assertThat(actualResult).isEqualTo(expectedResult);

    }

}
