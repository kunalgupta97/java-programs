public class forq11 {
    static void main(String[] args) {
        int n=7,f1=0,f2=1,next,i=1;
        int sum=0;
        for (i=1;i<n;i++){
            sum=sum+f2;
            next=f1+f2;
            f1=f2;
            f2=next;
        }
        System.out.println(sum);
    }
}
