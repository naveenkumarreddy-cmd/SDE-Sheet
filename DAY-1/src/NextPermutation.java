import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the size of array");
          int n = sc.nextInt();
          int[] arr = new int[n];
          System.out.println("Input array elements");

          for(int i=0;i<n;i++) {
              arr[i] = sc.nextInt();
          }

          System.out.println(Arrays.toString(arr));
          nextPermutation(arr);
          System.out.println("The next permutation is:");
          System.out.println(Arrays.toString(arr));
    }


    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        for(int i=n-2;i>=0;i--) {
            if(nums[i] < nums[i+1]) {
                index = i;
                break;
            }
        }

        if(index == -1) {
            reverse(nums,0,n-1);
            return;
        }

        for(int i=n-1;i>index;i--) {
            if(nums[i] > nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }
        reverse(nums,index+1,n-1);

    }

    public static void reverse(int[]arr,int start,int end) {

        while(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}
