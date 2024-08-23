package String;

public class XraiseN {
    public static int printpower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int NM1=printpower(x,n-1);

        return n * NM1;
    }

    public static void main(String[] args) {
      int result= printpower(5,3);
        System.out.println(result);
    }
}
