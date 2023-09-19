import static org.junit.Assert.*;
import org.junit.Test;
import MatrixAlgebra.MatrixMethods;

public class MatrixTests {

    // @Test
    // public void testDeterminants() {
    // int[][][] arrays = {
    // { { 1, 2 }, { 3, 4 } },
    // { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },
    // { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16, 17 }
    // },
    // { { 1, 2, 3, 4, 5 }, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19,
    // 20}}
    // };

    // int[] expecteds = {}

    // for (int[][] a : arrays) {

    // }
    // }

    // @Test
    // public void testDeterminant() {
    // int[][] a = { { 1, 2 }, { 3, 4 } };
    // int expected = -2;
    // int actual = MatrixMethods.determinant(a);
    // assertEquals(expected, actual);
    // }

    // @Test
    // public void testDeterminantNonsquare() {
    // int[][] a = { { 1, 2, 3 }, { 3, 4, 5 } };
    // assertThrows(IllegalArgumentException.class, () ->
    // MatrixMethods.determinant(a));
    // }

    @Test
    public void testTransposeWide() {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] expected = { { 1, 4 }, { 2, 5 }, { 3, 6 } };
        int[][] actual = MatrixMethods.transpose(a);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testTransposeTall() {
        int[][] a = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        int[][] expected = { { 1, 3, 5 }, { 2, 4, 6 } };
        int[][] actual = MatrixMethods.transpose(a);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testTransposeSquare() {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] expected = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };
        int[][] actual = MatrixMethods.transpose(a);
        assertArrayEquals(expected, actual);
    }

    public void testAdd() {
    }
}
