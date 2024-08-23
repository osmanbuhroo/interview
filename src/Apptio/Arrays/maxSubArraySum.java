package Apptio.Arrays;

public class maxSubArraySum {
    public static void main(String[] args) {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum contiguous sum is "
                + SubArraySum(a));
    }
    public  static  int SubArraySum(int arr[]){
        int maxSum=0;
        int curSum=0;
        for (int i = 0; i < arr.length; i++) {
            curSum+=arr[i];
            if(curSum>maxSum){
                maxSum=curSum;
            } else if (curSum<0) {
                curSum=0;
            }
        }
        return  maxSum;
    }
}
