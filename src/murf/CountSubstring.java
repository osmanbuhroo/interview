package murf;

public class CountSubstring {
    public static void main(String[] args) {
        countAndPrintSubtring("sahil");
    }
    public  static   void  countAndPrintSubtring(String str){
        int count =0;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <=n ; j++) {
                String substring = str.substring(i,j);
                if(!substring.isEmpty()){
                    System.out.print(substring+ " ");
                    count++;
                }

            }
        }
        System.out.println("count : " + count);
    }
}
