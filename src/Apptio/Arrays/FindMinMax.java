package Apptio.Arrays;

public class FindMinMax {
    public static void main(String[] args) {
     int [] arr = {1,2,3,4,5,6,7,9};
     minMax(arr);
    }
    public  static  void  minMax( int[] arr){
        int n = arr.length;
        int min= arr[0];
        int max = arr[0];
        for(int i=0;i<n;i++){
            if (arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("max:"+ max);
        System.out.println("min:"+ min);
    }

}
