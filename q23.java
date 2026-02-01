import java.util.Scanner;
public class q23 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int a = sc.nextInt();
        System.out.println("entera s num:");
        int b = sc.nextInt();
        while (a<=b){
            if (a%7==0) {
                System.out.println(a);
            }
            a++;
        }

    }
}
