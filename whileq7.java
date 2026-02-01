public class whileq7 {
    static void main(String[] args) {
        int n = 10,i=1;
        int sum=0;
        while (n>=i){
            if (i%2==0){
                sum = sum+i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
