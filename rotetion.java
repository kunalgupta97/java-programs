public class rotetion {
    public static void rotaion(int n,int rot){
        int n,rot,i=0;
    }
    public static void main(String[] args) {
        int n=1234;
        int temp=n;
        int count=0;
        int rot=3;
        int p;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        temp=n %(int) Math.pow(10,rot);
        p=n /(int) Math.pow(10,rot);
        temp=temp*(int)Math.pow(10,count-rot);
        temp=p+temp;
        System.out.print(temp);

        

   
    

    }
    
}
