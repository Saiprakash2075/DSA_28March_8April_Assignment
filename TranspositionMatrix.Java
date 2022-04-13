package DSAAssg1;

public class TranspositionMatrix {
    public static void main(String[] args) {
        int[][] a={{2,3,4},{5,6,7}};
        int row=a.length-1;
       // int col=a[i].length;
        System.out.println("original matrix");
        for(int i=0;i<2;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }
            System.out.println("transposition of matrix");
            for(int i=0;i<3;i++){
                for(int j=0;j<2;j++){
                    System.out.print(a[j][i]+" ");
                }
                System.out.println();
            }


    }
}
