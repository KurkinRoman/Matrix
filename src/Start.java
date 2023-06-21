public class Start {
    public static void main(String[] args) {
        int[][] matrixArray = {{5, 12, 5,}, {7, 5, 10,}, {9, 4, 8}};
        Matrix matrix = new Matrix(matrixArray);

        matrix.print();
        System.out.println();

        matrix.printRow(1);
        matrix.printMainDiagonal();
        matrix.printColumn(2);
    }
}
