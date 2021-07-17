import org.junit.Assert;
import org.junit.Test;

public class MatrixTransposedTest {
    @Test
    public void getCorrectElements () {

        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] resultMatrix = {{1,4,7}, {2,5,8}, {3,6,9}};

        MatrixImpl matrixImpl = new MatrixImpl(matrix);
        MatrixTransposed matrixTransposed = new MatrixTransposed(matrixImpl);
        boolean expected = true;
        for (int i = 0; i < resultMatrix.length; i++){
            for (int j = 0; j < resultMatrix[i].length; j++){
                if (resultMatrix[i][j] != matrixTransposed.getElement(i, j)){
                    expected = false;
                    break;
                }
            }
        }
        Assert.assertTrue(expected);
    }
}
