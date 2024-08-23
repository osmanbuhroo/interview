package murf;

public class SubarraySum {
    public static void main(String[] args) {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum contiguous sum is "
                + maxSubArray(a));
    }
    public  static  int maxSubArray(int arr []){
        int maxSum =0;
        int currSum =0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if(currSum>maxSum){
                maxSum = currSum;
            }
            else if (currSum<0){
               currSum = 0;
            }


        }
        return  maxSum;
    }
}
