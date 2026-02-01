public class q13 {
    static void main(String[] args) {
        int n = 121;
        int dn=n;
        int rev = 0;
        int rem =0;
        while (n>0){
            rem = n%10;
            rev = rev*10+rem;
            n/=10;
        }
        if (rev==dn){
            System.out.println("palindrome");

        }else{
            System.out.println("not");
        }

    }
}
