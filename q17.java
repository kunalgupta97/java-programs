public class q17 {
    static void main(String[] args) {
        int num = 100;
        int i = 2,j,c;
        while (i<=num) {
            c = 0;
            j = 2;
            while (j < i) {
                if (i % j == 0) {
                    c += 1;
                }
                j++;
            }
            if (c == 0) {
                System.out.println(j);
            }
            i++;
        }
    }
}
