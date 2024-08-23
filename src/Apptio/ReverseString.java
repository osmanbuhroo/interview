package Apptio;

public class ReverseString {

    public static  String reverseString(String input){
        char [] charArray=  input.toCharArray();
        int left = 0;
        int right = charArray.length -1;
        while (left< right){
            char temp = charArray[left];
            charArray[left]= charArray[right];
            charArray[right]= temp;
            left ++;
            right --;
        }
        return  new String(charArray);
    }

    public static void main(String[] args) {
        String original = "sahil";
        System.out.println(reverseString(original));
        int[] nums = {1, 5, 3, 9, 7};
        System.out.println(findlargestNumber(nums));
    }

    public   static boolean findlargestNumber (int [] arr){
        int max =0;
        for (int i =0; i<= arr.length; i++){
            if(arr [i] > max){
                max =   arr[i];
            }
        }
        System.out.println(max);
        return false;
    }
}
