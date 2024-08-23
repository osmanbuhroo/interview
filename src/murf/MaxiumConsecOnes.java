package murf;

public class MaxiumConsecOnes {
    public static void main(String[] args) {
        int arr[]={1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
        System.out.println( FindMaxConsecativeOnes(arr));
    }
    public  static  int FindMaxConsecativeOnes(int arr[]){
        int maxCount=0;
        int CurrCount=0;
        for(int num:arr){
            if (num==1){
                CurrCount++;

            }
            else {
                CurrCount=0;
            }
        }
        maxCount = Math.max(CurrCount,maxCount);
        return maxCount;
    }
}
