public class q16 {
    static void main(String[] args) {
        int num = 6;
        int sum = 0;
        int i = 1;
        while (num > i) {
            if (num % i == 0) {
                sum += i;
            }
            i++;
        }
        if (sum == num) {
            System.out.println("perfect number");
        } else {
            System.out.println("not");
        }
    }
}