package murf;

public class SubStringPresent {
    public static void main(String[] args) {
        String str = "anagram";
        String  substr= "gr";
        System.out.println(issubstringpresent(str,substr));
    }
    public  static  boolean issubstringpresent(String str, String subtring){
      int  n = str.length();
       int  m = subtring.length();
       boolean found = false;
        for (int i = 0; i <= n-m; i++) {
            int j;
            for (j = 0;  j <m ; j++) {
                if(str.charAt(i+j)!= subtring.charAt(j)){
                    break;
                }

            }
            if(j==m){
                found = true;
            }

        }

       return  found;
    }
}
