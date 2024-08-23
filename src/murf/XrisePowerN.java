package murf;

public class XrisePowerN {
    public  static  int xPowern(int x, int n){
        if(n==0){
            return  1;
        }
        if (x==0){
            return 0;
        }
        int NM1= xPowern(x,n-1);
        return  x*NM1;
    }

    public static void main(String[] args) {
        int result = xPowern(2,2);
        System.out.println( result);
    }
}
