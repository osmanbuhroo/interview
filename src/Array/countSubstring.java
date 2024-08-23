package Array;

public class countSubstring {
    public static void main(String[] args) {
        String str ="abc";
        printSubstring(str);
    }
    public  static  void printSubstring(String str){
        int n = str.length();
        int count =0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <=n ; j++) {
                String substring= str.substring(i,j);
                if(!substring.isEmpty()){
                    count ++;
                    System.out.println(substring+" ");

                }

            }

        }
    }
}
