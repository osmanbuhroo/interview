package Array;

import java.util.HashMap;
import java.util.Map;

public class frequeny {
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,4,5,3,4,3,5};
        printFrequency(arr);
    }
    public static  void printFrequency(int [] arr){
        int n = arr.length;
        HashMap<Integer,Integer> result = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(result.containsKey(arr[i])){
                result.put(arr[i], result.get(arr[i])+1 );
            }
            else
                result.put(arr[i], 1 );
        }
        for(Map.Entry<Integer,Integer>freq: result.entrySet()){
            System.out.println(freq.getKey()+" " + freq.getValue());
        }
    }

}
