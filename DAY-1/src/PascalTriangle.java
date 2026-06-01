import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in pascal triangle");
        int n = sc.nextInt();

        //Stores pascaltriangle values of each row
        List<List<Integer>> result = triangle(n);

        for(int i=0;i<n;i++) {
            System.out.println(result.get(i));
        }


    }

    public static int ncr(int row,int column) {
        row = row -1;
        column = column - 1;
        int result = 1;
        for(int i=0;i<column;i++) {
            result = result * (row-i);
            result = result /(i+1);
        }
        return result;
    }

    public static List<Integer> printRow(int row) {
        List<Integer> list = new ArrayList<>();
        //First element in row is 1
       int answer = 1;
       list.add(answer);

       for(int col=1;col<row;col++) {
           answer = answer * (row-col);
           answer = answer/col;
           list.add(answer);
       }
        return list;
    }

    public static List<List<Integer>> triangle(int n) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();

        for(int i=1;i<=n;i++) {
            answer.add(printRow(i));
        }
        return answer;
    }
}
