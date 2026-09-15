import java.util.*;

public class TwoDArray {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        // double square bracket is used to create 2D array.
        //  First bracket is for row and second bracket is for column.
        int n = matrix.length;
        // n is used to get the number of rows in the 2D array.
        int m =matrix[0].length;
        // m is used to get the number of columns in the 2D array.

        // input array elements
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++) {
            // input elements for each row
            for(int j=0; j<m; j++) {
                // input elements for each column
                matrix[i][j] = sc.nextInt();
                // input elements in the 2D array using scanner class.
                // i and j are used to access the elements of the 2D array. thses are the indexes of the 2D array.
            }
        }
        sc.close();

        // output
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }  
}
