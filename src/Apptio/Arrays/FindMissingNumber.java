package Apptio.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,6,7,8};
        System.out.println(missingNumber(arr));
    }
    public  static int missingNumber(int [] arr){
        int n = arr.length +1;  // length of an array including missing element
        int sumOfAllElements = n*(n+1)/2; // sum of all elemnts in current array
        int actualSum= 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
             int missingNumb = sumOfAllElements - actualSum;
           return  missingNumb;}}


