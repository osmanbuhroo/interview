package Array;

import java.util.Locale;

public class duplchar {
    public static void main(String[] args) {
        String  name = "sAhil amIn";
        printdup(name);
    }
    public  static  void  printdup(String str){
        int n = str.length();
        str =str.replace("//s", "").toLowerCase();
        int [] count = new int[256];
        for (int i = 0; i < n; i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i]>1){
                System.out.println((char)(i) +":" + count[i]);

            }
        }

    }
}

