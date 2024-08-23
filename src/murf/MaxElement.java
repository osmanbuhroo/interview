package murf;

public class MaxElement {
    public static void main(String[] args) {
        int [] arr= {12,7,5,2};

        System.out.println(seconMax(arr));

    }
    public  static  int seconMax(int arr[]){
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> max){
                secondmax =max;
                max = arr[i];
            }
            if(arr[i]>secondmax && arr[i]!=max){
                secondmax = arr[i];
            }

        }
        return  secondmax;
    }
}
