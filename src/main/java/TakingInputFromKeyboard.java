import java.util.Scanner;

public class TakingInputFromKeyboard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
       /* int num=sc.nextInt();
        System.out.println(num);*/
        double num=sc.nextDouble();
        System.out.println(num);
        System.out.println("Enter city");
        String city= sc.next();
        System.out.println("Your city:"+ city);

    }
}
