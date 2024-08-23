package murf;

public class KthElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(findKth(arr,3));
    }

    public  static  int  findKth(int arr[] , int k){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }
            }
        }
        int kthlargestelement = arr[arr.length-k];
        return kthlargestelement;
    }
}
