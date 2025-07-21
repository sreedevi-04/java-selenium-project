public class SortElementsUsingLoopsInArray1 {
    public static void main(String[] args) {
        int [] arry={10,25,40,15,30,20,35};
        for(int i=0;i<arry.length-1;i++) {
            for (int j = 0; j < arry.length - i - 1; j++) {
                if (arry[j] > arry[j + 1]) {
                    int temp = arry[j];
                    arry[j] = arry[j + 1];
                    arry[j + 1] =temp;
                }
            }
        }
for(int num : arry)
{
    System.out.print(num+" ");
}
        }

    }

