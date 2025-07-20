public class FindElementInArray {
    public static void main(String[] args) {
        int a = 100;

        int b[] = {200, 250, 100, 150, 300, 350};
        boolean status = false;
       /* for (int i = 0; i <= b.length-1; i++) {
            if (b[i] == a) {
                System.out.println(a + " is present in  array ");
                status = true;
                break;
            }
            System.out.println(b[i]);
        }*/
        for(int x:b){
            if(x==a){
                System.out.println(a+" is present in array");
                status=true;
                break;
            }

        }

        if (status ==false) {
            System.out.println(a + " is not present in array");
        }

    }
}