public class MatrixReview {
    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printEach(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static int[][] createArray(int width, int height, int initialValue) {
        int[][] matrix = new int[height][width];
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                matrix[row][col] = initialValue;
            }
        }
        return matrix;
    }

    public static String[][] createArray(int width, int height, String initialValue) {
        String[][] matrix = new String[height][width];
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                matrix[row][col] = initialValue;
            }
        }
        return matrix;
    }

    public static int[][] createBorderArray(int width, int height, int value) {
        int[][] matrix = new int[height][width];
        for (int col = 0; col < width; col++) {
            matrix[0][col] = value;
            matrix[height - 1][col] = value;
        }
        for (int row = 0; row < height; row++) {
            matrix[row][0] = value;
            matrix[row][width - 1] = value;
        }
        return matrix;
    }

    public static int getMinValue(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] < min) {
                    min = matrix[row][col];
                }
            }
        }
        return min;
    }

    public static int getMinValueColumn(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        int column = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] < min) {
                    min = matrix[row][col];
                    column = col;
                }
            }
        }
        return column;
    }

    public static int getMinInteriorValue(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        int column = 0;
        for (int row = 1; row < matrix.length - 1; row++) {
            for (int col = 1; col < matrix[0].length - 1; col++) {
                if (matrix[row][col] < min) {
                    min = matrix[row][col];
                    column = col;
                }
            }
        }
        return column;
    }

    public static int diagonalSum(int[][] matrix) {
        if (matrix.length == matrix[0].length) {
            int total = 0;
            for (int i = 0; i < matrix.length; i++) {
                total += matrix[i][i];
            }
            return total;
        }
        return 0;
    }
}