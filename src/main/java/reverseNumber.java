public class reverseNumber {
    public static void main(String[] args) {
        int i=1234;
        int num=1234;
        int reverse=0;
        while(num!=0){
           int a=num%10;

           reverse= reverse * 10 +a;
            num=num/10;;

        }System.out.println(reverse);


    }

}
