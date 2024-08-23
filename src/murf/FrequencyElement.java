package murf;

import java.util.HashMap;
import java.util.Map;

public class FrequencyElement {
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,4,5,3,4,3,5};
        countfreq(arr);
    }
    public  static  void countfreq( int arr[]){
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(result.containsKey(arr[i])){
                result.put(arr[i], result.get(arr[i])+1 );
            }
            else{
                result.put(arr[i],1 );
            }

        }
        for(Map.Entry<Integer,Integer> i: result.entrySet()){
            System.out.println(i.getKey()+" " + i.getValue());
        }
    }
}
