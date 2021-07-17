import org.junit.Assert;
import org.junit.Test;

public class MatrixImplTest {
    @Test
    public void getCorrectElements () {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        MatrixImpl resultMatrix = new MatrixImpl(matrix);
        boolean expected = true;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] != resultMatrix.getElement(i, j)){
                    expected = false;
                    break;
                }
            }
        }
        Assert.assertTrue(expected);
    }
}
