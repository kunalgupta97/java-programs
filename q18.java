public class q18 {
    static void main(String[] args) {
        int num =9,i=2;
        boolean flag=true;
        if (num<=1) {
            flag=false;
        }else if (num == 2){
            flag = true;

        }else{
            while(num>=i){
                if (num %i ==0){
                    flag=false;
                    break;
                }
                i++;
            }
            if (flag){
                System.out.println("prime");
            }else{
                System.out.println("not");
            }
        }
    }

}


