public class ReverseString {
    public static void main(String[] args) {
        String s = "selenium";
        /*String rev=" ";
        for( int i=s.length()-1;i>=0;i--){
             rev=rev +s.charAt(i);
        }
        System.out.println(rev);

    }*/
        // Approach 2 by converting string to character array
        char[] a = s.toCharArray();
        //System.out.println(a);
        String rev=" ";
        for(int i=a.length-1;i>=0;i--){
           rev= rev + a[i];
        }
        System.out.println(rev);
    }
}