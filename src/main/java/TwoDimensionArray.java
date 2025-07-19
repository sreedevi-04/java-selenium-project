public class TwoDimensionArray {
    public static void main(String[] args) {
        int a[][]=new int[3][2];
        //int[]a[]=[3][2];
        //int[][]a=[3][2];

       /* a[0][0]=300;
        a[0][1]=400;

        a[1][0]=500;
        a[1][1]=600;

        a[2][0]=700;
        a[2][1]=800;
        System.out.println(a.length);*/
     int b[][]={ {100,120},
                 {200,210},
                 {300,310}};
        System.out.println("Number of rows:"+b.length);
        System.out.println("number of columns:"+b[0].length);
        System.out.println(b[1][1]);
        for( int r=0;r<=2;r++) {
            for (int c=0;c<=1;c++) {
                System.out.print(b[r][c]+" ");
            }
            System.out.println();
        }
        }
    }

