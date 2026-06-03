import java.util.Scanner;

public class Rotate90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of square matrix");
        int n = sc.nextInt();
        int[][] matrix= new int [n][n];
         System.out.println("Enter elements of square matrix");
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix before rotating 90");
        display(matrix);
        rotate(matrix);
        System.out.println("Matrix after rotation");
        display(matrix);

    }

    public static void  display(int[][] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        //Transpose the matrix..
        for(int i=0;i<=n-2;i++) {
            for(int j=i+1;j<=n-1;j++) {
                swap(matrix,i,j);
            }
        }

        //reverse each row of matrix...
        for(int i=0;i<n;i++) {
            reverse(matrix[i]);
        }

    }

    public static void swap(int[][] arr,int i,int j) {
        int  temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    public static void reverse(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
