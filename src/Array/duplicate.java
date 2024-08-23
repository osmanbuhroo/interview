package Array;

import java.util.HashSet;

public class duplicate {
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,4,5,3,4,3,5};
        printduplicate(arr);
    }
    public  static  void printduplicate (int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(!set.add(arr[i])){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
