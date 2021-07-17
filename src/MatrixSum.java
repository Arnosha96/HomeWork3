public class MatrixSum extends MatrixOperation{

    private final Matrix a;
    private final Matrix b;

    public MatrixSum(Matrix a, Matrix b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException {
        return a.getElement(i, j) + b.getElement(i, j);
    }
}
