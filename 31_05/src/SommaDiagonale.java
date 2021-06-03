public class SommaDiagonale {
    public static void main(String[] args) {
        int[][] matrix;
        matrix = new int[][]{
                {1, 7, 0, -1},
                {-1, 3, 8, 5},
                {2, 0, -2, 4},
                {6, 1, 5, 9}};
        System.out.println(SommaQuad(matrix, false, 4));
    }

    public static int SommaQuad(int[][] matrix, boolean leftSum, int dim) {
        int sum = 0;
        if (leftSum) {
            for (int i = 0; i < dim; i++) {
                sum += matrix[i][i];
            }
        } else {
            int j = dim - 1;
            for (int i = 0; i < dim; i++) {
                sum += matrix[i][j];
                j--;
            }
        }
        return sum;
    }
}
