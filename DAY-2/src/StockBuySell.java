import java.util.Scanner;

public class StockBuySell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days to be traded..");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Input stock market prices on each day");

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The largest profit from given prices of staock market..");
        System.out.println(maxProfit(arr));
    }

        public static int maxProfit(int[] prices) {

            int profit = 0;
            int minCost = Integer.MAX_VALUE;

            for(int i=0;i<prices.length;i++) {
                //Finding least prices...
                if(prices[i] < minCost) {
                    minCost = prices[i];
                } else {
                    //calculating maximum profit...
                    profit = Math.max(profit,prices[i]-minCost);
                }
            }
            return profit;
        }
    }

