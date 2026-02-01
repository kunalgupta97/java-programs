public class forq10 {
    static void main(String[] args) {
        int n = 7,f1=0,f2=1,next,i=1;
        for (i=1;i<n;i++){
            System.out.println(f1+"");
            next=f1+f2;
            f1=f2;
            f2=next;
        }
        System.out.println(f1);
    }
}
