import java.util.Arrays;

public class MutableVsImmutable {
    public static void main(String[] args) {
        int []a={112,23,34,45};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);// mutable---> i changes original values
        System.out.println(Arrays.toString(a));
        //immutable
        String s= new String("Welcome");
        s.concat("to java");// original methos is not able to change original value
        System.out.println(s);
        String concatString=s.concat(" to java");
        System.out.println(concatString);
    }

}
