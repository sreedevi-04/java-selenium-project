public class CountRepeatedNum {
    public static void main(String[] args) {
        int[] a = {10, 20, 25, 30, 45, 10, 10, 10, 20};
        int count = 0;
        int num = 10;
        /*for(int i=0;i<a.length;i++){
            System.out.println(a[i]);*/
        for (int value : a) {
            if (value == num) {
                count++;
            }
        }
        System.out.println(count);
    }

}