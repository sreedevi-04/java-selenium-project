import java.sql.SQLOutput;
import java.util.Arrays;

public class MutableVsImmutable {
    public static void main(String[] args) {
        int []a={112,23,34,45};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);// mutable---> i changes original values
        System.out.println(Arrays.toString(a));
        //immutable
        /*String s= new String("Welcome");
        s.concat("to java");// original methos is not able to change original value
        System.out.println(s);
        String concatString=s.concat(" to java");
        System.out.println(concatString);*/

        // StringBuffer

       /* StringBuffer s = new StringBuffer("Welcome");
        s.append(" to java");
        System.out.println(s);*/

        //StringBuilder
        /*StringBuilder s= new StringBuilder("Welcome ");
        s.append("to selenium");
        System.out.println(s);*/

        //Case1
        /*String s1= "Welcome";// here is object is not created
        String s2= "Welcome";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));*/

        //case2
        /*String s1=new String("Welcome");// object is created and its object reference variable value is generated for variable s1 due to new keyword
        String s2= new String("Welcome");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));*/

        //case3
        String s1=new String("Welcome");
        String s2="Welcome";
        String s3=s1;
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));



    }

}
