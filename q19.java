public class q19 {
    static void main(String[] args) {
        int num = 7,f1=0,f2=1,next,i=1;

        while (num>=i){
            System.out.println(f1+" ");
            next=f1+f2;
            f1=f2;
            f2=next;
            i++;
        }

    }
}

