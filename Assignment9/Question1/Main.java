/**
 * Experiment 9 - Question 1
 */
class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.print("First row:");
        for (int j = 0; j < 3; j++) {
            System.out.print(" " + matrix[0][j]);
        }
        System.out.println();
        System.out.print("Last row:");
        for (int j = 0; j < 3; j++) {
            System.out.print(" " + matrix[2][j]);
        }
        System.out.println();
    }
}
