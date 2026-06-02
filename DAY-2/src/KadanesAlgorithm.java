import java.util.Scanner;
public class KadanesAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Input Array elements");

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The largest sum of array using kadane's algorithm is:");
        System.out.println(maxSum(arr));

    }
    public static int maxSum(int[] arr) {

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i=0;i<arr.length;i++) {
            currentSum += arr[i];
            maxSum = Math.max(currentSum,maxSum);
            if(currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

}
