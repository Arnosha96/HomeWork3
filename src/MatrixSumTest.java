import org.junit.Assert;
import org.junit.Test;

public class MatrixSumTest {
    @Test
    public void getCorrectElements () {

        int[][] matrix1 = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] matrix2 = {{1,4,7}, {2,5,8}, {3,6,9}};
        int[][] resultMatrix = {{2,6,10}, {6,10,14}, {10,14,18}};

        MatrixImpl matrixImpl1 = new MatrixImpl(matrix1);
        MatrixImpl matrixImpl2 = new MatrixImpl(matrix2);
        MatrixSum matrixSum = new MatrixSum(matrixImpl1, matrixImpl2);
        boolean expected = true;
        for (int i = 0; i < resultMatrix.length; i++){
            for (int j = 0; j < resultMatrix[i].length; j++){
                if (resultMatrix[i][j] != matrixSum.getElement(i, j)){
                    expected = false;
                    break;
                }
            }
        }
        Assert.assertTrue(expected);
    }
}
