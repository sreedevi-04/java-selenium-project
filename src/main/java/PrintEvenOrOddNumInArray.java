public class PrintEvenOrOddNumInArray {
    public static void main(String[] args) {
        int []a={ 12,3,4,5,6};
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0){
                System.out.println(a[i]+" is Even number");
            }
            else{
                System.out.println(a[i]+" is Odd number");
            }
        }
    }
}
