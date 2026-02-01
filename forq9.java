public class forq9 {
    static void main(String[] args) {
        int n =7;
        if (n<=1){
            System.out.println("not prime");
        }else if (n==2){
            System.out.println("prime");
        }else{
            for (int i=2;i<n;i++){
                if (n%i==0){
                    System.out.println("not prime");
                    break;
                }else{
                    System.out.println("prime");
                }
            }
        }
    }
}
