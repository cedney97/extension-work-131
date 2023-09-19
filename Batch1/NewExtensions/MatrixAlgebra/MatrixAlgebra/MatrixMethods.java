package MatrixAlgebra;

public class MatrixMethods {

    // public static int determinant(int[][] a) {
    //     if (a.length != a[0].length) {
    //         throw new IllegalArgumentException("Matrix must be square");
    //     }

    //     int leftDiagonal = 1;
    //     int rightDiagonal = 1;
    //     for (int i = 0; i < a.length; i++) {
    //         leftDiagonal *= a[i][i];
    //         rightDiagonal *= a[i][a.length - i - 1];
    //     }
    //     return leftDiagonal - rightDiagonal;
    // }

    public static int[][] transpose(int[][] a) {
        int[][] ans = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                ans[j][i] = a[i][j];
            }
        }
        return ans;
    }

    public static int[][] add(int[][] a, int[][] b) {
        if (a.length != b.length || a[0].length != b[0].length) {
            throw new IllegalArgumentException("Matrix dimensions incompatible");
        }

        int[][] ans = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                ans[i][j] = a[i][j] + b[i][j];
            }
        }
        return ans;
    }

    public static int[][] multiply(int[][] a, int[][] b) {
        if (a[0].length != b.length) {
            throw new IllegalArgumentException("Matrix dimensions incompatible");
        }

        int[][] ans = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                int dotProduct = 0;
                for (int k = 0; k < a[0].length; k++) {
                    dotProduct += a[i][k] * b[k][j];
                }
                ans[i][j] = dotProduct;
            }
        }

        return ans;
    }

    public static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

}