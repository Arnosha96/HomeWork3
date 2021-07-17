public abstract class MatrixOperation implements Matrix{

    public static Matrix generateNewMatrix(int x, int y, int range){
        int[][] newMatrix = new int[x][y];

        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                newMatrix[i][j] = (int) (Math.random() * (range + 1));
            }
        }
        Matrix matrixImpl = new MatrixImpl(newMatrix);
        MatrixOperation.matrixPrint(x, y, matrixImpl);
        return matrixImpl;
    }

    public static void matrixPrint (int x, int y, Matrix matrix){
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++) {
                System.out.format("%s ", matrix.getElement(i,j));
            }
            System.out.println();
        }
        System.out.println();
    }
}
