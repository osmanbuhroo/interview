package String;

public class fabo {
    public static int fbo(int n){
        if (n==0|| n==1){
            return 1;
        }
        return n* fbo(n-1);
    }


    public static void main(String[] args) {
        System.out.println(fbo(5));
    }

}
