import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingDataIntoArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[]a=new int[5];
        for( int i=0; i<a.length;i++){
            System.out.println("Enter a value for the position "+ i+" :");
            a[i]=sc.nextInt();
        }
        System.out.println("Array elements are:");
        System.out.println(Arrays.toString(a));
    }
}
