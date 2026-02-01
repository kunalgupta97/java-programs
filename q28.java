public class q28 {
    static void main(String[] args) {
        int n = 756386475;
        int m = 9;
        while (n>0){
            int digit = n%10;
            if (digit<m){
                m=digit;
            }
            n/=10;
        }
        System.out.println((m));

    }
}
