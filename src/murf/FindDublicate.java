package murf;

public class FindDublicate {
    public static void main(String[] args) {
        findDuplicatechar("sahil amin");
    }
    public  static  void  findDuplicatechar(String str){
        if(str.length()==0){
            return;
        }
        str = str.replace("\\s", "").toLowerCase();
        int cout[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            cout[str.charAt(i)]++;
        }
        for (int i = 0; i < cout.length; i++) {
            if (cout[i]>1){
                System.out.println((char) (i) +":" + cout[i]);
            }

        }
    }

}
