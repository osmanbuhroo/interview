package Apptio.Arrays;

import java.util.Arrays;

public class SumOfpairsTargetNumber {
    public static void main(String[] args) {
        int [] arr = {1, 5, 7, -1};

        int target =6;

        sumOfpairs(arr,target);

    }
    public  static  void  sumOfpairs(int arr [],int  target){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            if (arr[start] + arr[end] > target){
                end--;
            } else if (arr[start] + arr[end]< target) {
                start++;
            } else if (arr[start] + arr[end] == target) {
                System.out.println("pairs=> "+ arr[start] +":"+ arr[end]);
            }
            start++;
            end--;
        }
    }
}
