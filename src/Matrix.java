public class Matrix {
    private int[][] matrix;
    private int columns;
    private int rows;
    public Matrix(int[][] matrix){
        this.matrix = matrix;
        this.rows = matrix.length;
        this.columns = matrix[0].length;
    }
    public void print(){
        for (int i = 0; i < rows; i ++){
            for (int j = 0; j < columns; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void printColumn(int column) {
        for(int i = 0; i < rows; i ++){
            System.out.print(matrix[i][column]);
        }
    }
    public void printRow(int row) {
        for(int j = 0; j < columns; j ++){
            System.out.print(matrix[row][j] + " ");
        }
        System.out.println();
    }
    public void printMainDiagonal() {
        for (int i = 0; i < rows; i++ ) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }
    public void printSecondDiagonal() {
        for (int i = 0; i < rows; i++ ) {
            System.out.print(matrix[i][columns] + " ");
        }
        System.out.println();
    }
}
