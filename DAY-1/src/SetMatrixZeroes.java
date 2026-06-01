import java.util.Arrays;
import java.util.Scanner;

public class SetMatrixZeroes {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int rows = sc.nextInt();
    System.out.println("Enter number of columns in each row");
    int col = sc.nextInt();
    int[][] arr = new int[rows][col];
    System.out.println("Input array elements");

    for(int i=0;i<rows;i++) {
        for(int j=0;j<col;j++) {
            arr[i][j] = sc.nextInt();
        }
    }
    System.out.println("Before modifying the array");
    display(arr);

    setZeroes(arr);

    System.out.println("After modifying the array");
   display(arr);

   }

    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;



        int col0 = 1;

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if(j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }

        for(int i=1;i<n;i++) {
            for(int j=1;j<m;j++) {
                if(matrix[i][j] != 0) {
                    if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        //checking columns markings...
        if(matrix[0][0] == 0) {
            for(int j=0;j<m;j++) {
                matrix[0][j] = 0;
            }
        }

        //checking for row markings...
        if(col0 == 0) {
            for(int i=0;i<n;i++) {
                matrix[i][0] = 0;
            }
        }


    }

    public static void display(int[][] arr) {
       int n = arr.length;
       int m = arr[0].length;

       for(int i=0;i<n;i++) {
           for(int j=0;j<m;j++) {
               System.out.print(arr[i][j] + "  ");
           }
           System.out.println();
       }

    }
}
