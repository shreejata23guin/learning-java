package arrays2d;

public class MatrixDemo {
    public static void main(String[] args){

        int[][] matrix= {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matrix Elements:");
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
    }
}


//| Line                                         | Description                                                                   |
//| -------------------------------------------- | ----------------------------------------------------------------------------- |
//| `public class MatrixDemo {`                  | Starts the class definition.                                                  |
//| `public static void main(String[] args) {`   | Main method – Java program starts here.                                       |
//| `int[][] matrix = { ... };`                  | Declares a 2D array with 3 rows and 3 columns. Each row is itself a 1D array. |
//| `{1,2,3}, {4,5,6}, {7,8,9}`                  | These are the values inside the matrix.                                       |
//| `for (int i = 0; i < matrix.length; i++)`    | Outer loop: goes through each **row** (total 3).                              |
//| `for (int j = 0; j < matrix[i].length; j++)` | Inner loop: goes through each **column** in row `i`.                          |
//| `System.out.print(matrix[i][j] + " ");`      | Prints the element at row `i` and column `j`.                                 |
//| `System.out.println();`                      | Moves to a new line after printing each row.                                  |