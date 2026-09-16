// Staircase Search Algorithm in Java :
// time comlexity: O(n+m) where n is the number of rows and m is the number of columns
// start from : top-right corner or bottom-left corner of the matrix


public class StaircaseSearch {
    public static boolean staircaseSearch(int matrix[][], int key){
        int row = 0;
        int col = matrix[0].length-1;
        // start from top right corner of matrix

        while(row<matrix.length && col>=0){
            if(matrix[row][col] == key){
                System.out.println("Key found at: (" + row + ", " + col + ")");
                return true;
            }
            else if(matrix[row][col] > key){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int key = 37;
        staircaseSearch(matrix, key);
    }

}

  
