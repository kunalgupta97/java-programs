public class q15 {
    static void main(String[] args) {
        int n = 153;
        
        int sum = 0;
        int rem = 0;

        while (n>1){
            n= n%10;
            rem = rem*rem*rem;
            sum = sum+rem;
            n/=10;
        }
        if (sum == n){
            System.out.println("armatrong");

        }else{
            System.out.println("not");
        }

    }
}
