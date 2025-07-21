public class FindMissingNumINArray {
    public static void main(String[] args) {
        int a[]={1,2,4,5};
        int n=a.length+1;
       int Expectednum= n*(n+1)/2;
       int actualSum=0;
       for(int num: a){
           actualSum=actualSum +num;
        }
       int missingNum=Expectednum-actualSum;
        System.out.println(missingNum);
    }
}
