import java.sql.SQLOutput;

public class largestNumber {
    public static void main(String[] args) {
        int a=50, b=100, c=130;
        if(a>b && a>c){
            System.out.println(a+ " is the largest number");
        }
        else if(b>a && b>c){
            System.out.println(b+" is the largest number ");
        }
        else{
            System.out.println(c+" is the largest number");

        }

    }
}