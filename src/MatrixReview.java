public class MatrixReview {
    public static void print(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printEach(int[][] grid) {
        for (int[] row : grid) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static int[][] createArray(int width, int height, int initialValue) {
        int[][] array = new int[height][width];
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                array[row][col] = initialValue;
            }
        }
        return array;
    }

    public static String[][] createArray(int width, int height, String initialValue) {
        String[][] array = new String[height][width];
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                array[row][col] = initialValue;
            }
        }
        return array;
    }
}
