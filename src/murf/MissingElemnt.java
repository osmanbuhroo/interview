package murf;

public class MissingElemnt {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,6,7,8};
        System.out.println(findMissingNum(arr));
    }

    public  static  int  findMissingNum(int arr []){
        int n = arr.length+1;
        int actuallsum = n*(n+1)/2;
        int sum =0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return  actuallsum-sum;
    }
}
