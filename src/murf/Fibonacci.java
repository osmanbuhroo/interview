package murf;

public class Fibonacci {
    public  static  int  fibonacci_series(int n){
        int a=0, b=1, c;
        if(n==0){
            return  a;
        }
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < n; i++) {
            c= a+b;
            a=b;
            b=c;
            System.out.println(b);
        }
     return 0;
    }

    public static void main(String[] args) {
        fibonacci_series(5);
    }
}
