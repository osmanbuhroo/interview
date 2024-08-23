package Apptio.Arrays;

import java.util.HashSet;

public class FindDuplicateElements {
    public static void main(String[] args) {
        int[] arr= {2,3,4,5,6,7,2,4,6,4};
        printDuplicate(arr);
    }
    public static  void printDuplicate(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length ; i++) {
            if(!set.add(arr[i])){
                System.out.println("duplicate elements in an array are :"+ arr[i]);
            }}}
}
