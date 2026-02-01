public class q29 {
    static void main(String[] args) {
        int n= 546729831;
        int max=7;
        while (n>0){
            int d = n%10;
            if (d>max){
                max=d;
            }
            n/=10;
        }
        System.out.println(max);
    }
}
