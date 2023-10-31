package arrayrecursion;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertArrayEquals;

public class ArrayRecursionTestSuite {
    @Test
    public void testSearchArray() {
        int[] arr = {1, 2, 3, 4, 5};
        assertTrue(ArrayRecursionMethods.searchArray(arr, 3)); // Element exists
        assertFalse(ArrayRecursionMethods.searchArray(arr, 6)); // Element does not exist
        assertFalse(ArrayRecursionMethods.searchArray(new int[0], 3)); // Empty array
        int[] arr2 = {
                42, 17, 56, 89, 23, 5, 72, 14, 36, 67,
                29, 50, 8, 98, 61, 33, 77, 9, 48, 91,
                3, 45, 80, 19, 68, 12, 62, 39, 55, 21,
                70, 4, 28, 84, 7, 51, 16, 92, 37, 58,
                10, 47, 79, 26, 64, 1, 34, 85, 24, 73,
                59, 6, 30, 78, 2, 43, 96, 20, 65, 11,
                76, 27, 88, 54, 15, 87, 31, 60, 38, 69,
                18, 41, 95, 32, 63, 13, 44, 81, 22, 75,
                40, 66, 25, 83, 52, 99, 35, 74, 53, 94,
                46, 82, 49, 97, 71
        };
        assertTrue(ArrayRecursionMethods.searchArray(arr2, 56)); // Element exists
        assertTrue(ArrayRecursionMethods.searchArray(arr2, 42)); // First element
        assertTrue(ArrayRecursionMethods.searchArray(arr2, 71)); // Last element
        assertFalse(ArrayRecursionMethods.searchArray(arr2, 100)); // Element does not exist
    }

    @Test
    public void testMap() {
        int[] arr = {1, 2, 3, 4, 5};

        // Test addition
        assertArrayEquals(new int[]{2, 3, 4, 5, 6}, ArrayRecursionMethods.map(arr, "+", 1));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, ArrayRecursionMethods.map(arr, "+", 0));

        // Test subtraction
        assertArrayEquals(new int[]{0, 1, 2, 3, 4}, ArrayRecursionMethods.map(arr, "-", 1));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, ArrayRecursionMethods.map(arr, "-", 0));

        // Test multiplication
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, ArrayRecursionMethods.map(arr, "*", 1));
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, ArrayRecursionMethods.map(arr, "*", 0));

        // Test division
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, ArrayRecursionMethods.map(arr, "/", 1));
        assertArrayEquals(new int[]{0, 0, 0, 0, 1}, ArrayRecursionMethods.map(arr, "/", 5));


        // Test with an empty array
        int[] emptyArr = new int[0];
        assertArrayEquals(new int[0], ArrayRecursionMethods.map(emptyArr, "+", 5));
        assertArrayEquals(new int[0], ArrayRecursionMethods.map(emptyArr, "-", 2));
        assertArrayEquals(new int[0], ArrayRecursionMethods.map(emptyArr, "*", 3));
        assertArrayEquals(new int[0], ArrayRecursionMethods.map(emptyArr, "/", 4));
    }

    @Test
    public void testConcatenateArrays() {
        // Test concatenating two non-empty arrays
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] result = ArrayRecursionMethods.concatenateArrays(arr1, arr2);
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, result);

        // Test concatenating an empty array with a non-empty array
        int[] emptyArr = {};
        result = ArrayRecursionMethods.concatenateArrays(emptyArr, arr2);
        assertArrayEquals(arr2, result);

        // Test concatenating a non-empty array with an empty array
        result = ArrayRecursionMethods.concatenateArrays(arr1, emptyArr);
        assertArrayEquals(arr1, result);

        // Test concatenating two empty arrays
        result = ArrayRecursionMethods.concatenateArrays(emptyArr, emptyArr);
        int[] expectedEmpty = {};
        assertArrayEquals(expectedEmpty, result);

    }

}
