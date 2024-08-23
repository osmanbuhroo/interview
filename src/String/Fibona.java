package String;

public class Fibona {
    public static  int fibonacci(int n){
        int a =0, b=1, c;
        if(n==0){
            return a ;
        }
        System.out.print(a +" ");
        System.out.print(b+" ");

        for (int i = 0; i < n; i++) {
            c=a+b;
            a=b;
            b=c;
            System.out.print(b + " ");
        }
       return 0;
    }

    public  static  boolean isPalaindrome(int n){
        int reverse=0;
        int  reminder;
       int  orginalNum = n;
        while (n!=0){
            reminder = n%10;
            reverse = reverse*10 +reminder;
            n = n/10;
        }
        if (orginalNum == reverse){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n =9;
        System.out.println(fibonacci(n));
        int num = 3634;
        System.out.println(isPalaindrome(num));

    }
}
