public class Main {
    public static void main(String[] args) {
        final int x = 3;
        final int y = 3;
        int range = 10;
        Matrix matrixImpl = MatrixOperation.generateNewMatrix(x, y, range);
        Matrix matrixTransposed = new MatrixTransposed(matrixImpl);
        Matrix matrixSum = new MatrixSum(matrixImpl, matrixTransposed);

        MatrixOperation.matrixPrint(x, y, matrixTransposed);
        MatrixOperation.matrixPrint(x, y, matrixSum);
    }
}
