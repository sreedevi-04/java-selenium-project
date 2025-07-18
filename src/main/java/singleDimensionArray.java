public class singleDimensionArray {
    public static void main(String[] args)
    {
        /*int a[]= new int[10];
        a[0]=2;
        a[1]=3;
        a[2]=4;
        a[3]=5;
        a[4]=6;*/
    int a[]={100,200,300,400,500};
        System.out.println(a.length);

        /*for(int i=0; i<=a.length-1; i++){
            System.out.println(a[i]);
        }*/
      for(int x:a){
          System.out.println(x);
      }

    }
}
