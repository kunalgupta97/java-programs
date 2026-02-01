public class q14 {
    static void main(String[] args) {
        int n = 1123;
        int sum = 0 ;
        int rem = 0;
        while (n>0){
            rem = n%10;
            sum = sum+rem;
            n/=10;
        }
        System.out.println(sum);
    }
}
