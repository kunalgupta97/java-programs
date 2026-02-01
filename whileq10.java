public class whileq10 {
    static void main(String[] args) {
        int n=153;
        int rem = 0;
        int pro=1;
        while(n>0){
            rem = n%10;
            pro=pro*rem;
            n/=10;

        }
        System.out.println(pro);
    }
}
