package murf;

public class Majority {
    public static void main(String[] args) {
        int arr[] = {1,2,4,4,4,5,3,4,4,5,4,3,4};
        System.out.println(isMajority(arr));
    }
    public  static  int  isMajority(int arr []){
        int count = 0;
        int  element =0;

        for (int i = 0; i < arr.length; i++) {
            if(count ==0){
                count =1;
                element = arr[i];
            } else if (arr[i] == element) {
                count++;
            }
            else count--;

        }
        return  element;

        }
}
