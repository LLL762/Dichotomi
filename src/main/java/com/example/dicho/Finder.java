package com.example.dicho;

import static com.example.dicho.Utility.getMedian;
import static com.example.dicho.Utility.splitArray;

/**
 * CheckStyle forces me.
 */
public class Finder {

    /**
     * Search intToFind in input using dichotomy.
     *
     * @param input     array to search
     * @param intToFind int to find
     * @return index of intToFind if present or else -1
     */
    public int find(final int[] input, final int intToFind) {

        int median;
        int diff;
        int[] subArray;

        if (input.length == 0) {
            return -1;
        }

        if (input.length <= 1) {

            return input[0] == intToFind ? 0 : -1;

        }

        median = getMedian(input.length) - 1;
        diff = intToFind - input[median];

        switch ((int) Math.signum(diff)) {

            case 0: {

                return median;
            }

            case 1: {

                subArray = splitArray(input, median + 1, input.length - 1);

                diff = find(subArray, intToFind);

                if (diff == -1) {
                    return -1;
                }


                median += diff + 1;
                return median;

            }
            case -1: {

                subArray = splitArray(input, 0, median - 1);

                diff = find(subArray, intToFind);

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
