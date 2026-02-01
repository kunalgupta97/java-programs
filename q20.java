public class q20 {
    static void main(String[] args) {
        int n=7,f1=0,f2=1,next,i=1;
        int sum = 0;
        while (n >=i){
            sum=sum+f1;
            next = f1+f2;
            f1=f2;
            f2=next;

            i++;
        }
        System.out.println(sum
        );
    }
}
