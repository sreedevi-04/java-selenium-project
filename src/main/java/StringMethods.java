import java.util.Arrays;
import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String s="Wellcome";
        //String S=new String("Welcome");
        System.out.println(s.length());
        System.out.println("Good day". length());
        String s1="Welcome to";
        String s2="java";
        String s3="Automation";
        System.out.println(s1.concat(s2).concat(s3));
        System.out.println(s1.concat(s2+s3));
        System.out.println(s1+s2+s3);
        System.out.println("welcome".concat("to java"));
        String s4= "   Hello Tuesday    ";
        System.out.println(" Before trim " + s4.length());
        System.out.println("After trim " +s4.trim().length());
       String s5="character count";
        System.out.println(s5.charAt(1));
        System.out.println(s5.contains("count"));// true
        System.out.println(s5.contains("ch"));//true
        System.out.println(s5.contains("vowel"));//false
        //equals() equalsIngore()
        s = "java";
        s1 = "Java";
        s5 = "selenium";
        System.out.println(s1 == s2);
        System.out.println(s.equals(s1));
        System.out.println(s.equals("Java"));
        System.out.println(s1 == s5);
        System.out.println(s.equalsIgnoreCase(s5));
        System.out.println(s.equalsIgnoreCase(s1));
        System.out.println(s.equalsIgnoreCase("Java"));
        //replace()----> single char/sequence of character(string)
         s= "Welcome to selenium java selenium python selenium c+";
        System.out.println(s.replace('e','x'));
        System.out.println(s.replace("selenium", "playwright"));
        s1="Welcome";
        //System.out.println(s1.substring(1,5));
        s="selenium";
        System.out.println(s.substring(1,7));
        s="sreedevi";
        System.out.println(s.toUpperCase());
        s1="SNEHA";
        System.out.println(s1.toLowerCase());
        System.out.println(s1.substring(0,3));
        System.out.println(s1.substring(1,3));
        System.out.println(s1.substring(1,4));
        //Split();
        s="abcd@gmail.com";
      String[]a=s.split("@");
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(Arrays.toString(a));
        s="$12,35,15,60";
        s1=s.replace("$"," ");
        s2=s1.replace(","," ");
        s="abc,123@gmail.com";
        String[]arry=s.split(",");
        System.out.println(arry[0]);
        System.out.println(arry[1]);
        //System.out.println(Arrays.toString(arry));
        String []a1 =arry[1].split("@");
        System.out.println(Arrays.toString(a1));
        s="sreedevi patil";
       boolean b = s.contains("patil");
        System.out.println(b);
        System.out.println(s.replace("p","P").contains("Patil"));














    }
}
