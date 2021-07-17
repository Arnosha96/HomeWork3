public class MatrixTransposed extends MatrixOperation {

    private final Matrix a;

    public MatrixTransposed(Matrix a) {
        this.a = a;
    }

    @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException {
        return a.getElement(j, i);
    }
}
