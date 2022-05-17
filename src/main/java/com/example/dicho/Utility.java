/**
 * CheckStyle forces me.
 */

package com.example.dicho;

public final class Utility {
    private Utility() {

    }

    /**
     * Cut an array in 2 parts, return one part.
     *
     * @param input array to cut
     * @param start first cut index
     * @param end   second cut index
     * @return a yummy array
     */
    public static int[] splitArray(
            final int[] input,
            final int start,
            final int end) {

        final int[] output = new int[end - start + 1];

        for (int i = start; i <= end; i++) {

            output[i - start] = input[i];

        }

        return output;
    }


    /**
     * Hello.
     *
     * @param input int
     * @return One median value for the given input
     */
    public static int getMedian(final int input) {

        return (int) Math.ceil(((double) input) / 2);

    }

}
