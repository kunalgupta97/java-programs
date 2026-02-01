public class q10 {
    public static void main(String[]args){
        int n = 153,por=1,rem;
        while (n>0){
             rem = n%10;
             por= por*rem;
             n/=10;
        }
        System.out.println(por);
    }
}
