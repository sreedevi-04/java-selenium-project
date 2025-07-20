import java.sql.SQLOutput;
import java.util.Scanner;

public class TakingMultipleInputsFromKeyboard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      /*  System.out.println("Enter first number ");
      int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();
        System.out.println("Sum of Two number:"+ (num1+num2));*/
        System.out.println("Enter your Age");
        int Age=sc.nextInt();
        System.out.println(Age);
        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println(name);
        System.out.println("Enter your unkown value");
        Object value= sc.next();
        System.out.println(value);



    }
}
