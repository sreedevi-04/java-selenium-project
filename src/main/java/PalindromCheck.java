public class PalindromCheck {
    public static void main(String[] args) {
        String P="talat";
        String temp="talat";
        String rev="";

        for( int i=P.length()-1;i>=0;i--){
           rev= rev + P.charAt(i);
        }
        //System.out.println(rev);
        if(rev.equals(temp)) {
            System.out.println(temp + " is a palindrom");
        }
        else{
            System.out.println(temp+" is not a palindrom");

        }

    }

}
