package String;

public class Palaindrome {
    public static void main(String[] args) {
        int num =3553, reverse =0 ,reminder ;
        int originalnum=num;
        while (num!=0){
            reminder = num%10;
            reverse = reverse *10 +reminder;
            num= num/10;

        }
        if (originalnum == reverse){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }

    }
}
