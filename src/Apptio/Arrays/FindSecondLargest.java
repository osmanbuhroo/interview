package Apptio.Arrays;

public class FindSecondLargest {
    public static void main(String[] args) {
        int [] arr= {12,7,5,2};

        System.out.println(findSecondLargestElement(arr));

    }
    public  static  int findSecondLargestElement(int [] arr){
        int max = Integer.MIN_VALUE;
        int secondMax= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                secondMax= max;
                max = arr[i];
            } else if (arr[i]>secondMax && arr[i] !=max) {
                secondMax= arr[i];
            }
        }
        if (secondMax == Integer.MIN_VALUE){
            System.out.println("there is 2nd largest element");
        }

        return secondMax;
    }
}
