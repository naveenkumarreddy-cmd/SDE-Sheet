import java.util.Arrays;
import java.util.Scanner;

public class DutchNationalFlagAlgorithm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Input Array elements only... 0,1,2");

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Before Sorting:\n" + Arrays.toString(arr));
        sortColors(arr);
        System.out.println("After Dutch National Flag Algorithm... ");
        System.out.println(Arrays.toString(arr));

    }

    public static  void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid <= high) {

            if(nums[mid] == 0) {
                swap(nums,low,mid);
                low++;
                mid++;
            } else if(nums[mid] == 1) {
                mid++;
            } else {
                swap(nums,mid,high);
                high--;
            }
        }


    }

    public static  void swap(int [] arr, int first,int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
