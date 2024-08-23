package Apptio.Arrays;

import java.util.Arrays;

public class findKthelement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(kthelement(arr, 3));
    }

    public static int kthelement(int[] arr, int k) {
//        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                   int temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;

                }

            }

        }

        int kthelargestelement= arr[arr.length-k];
       return kthelargestelement;

    }
}
