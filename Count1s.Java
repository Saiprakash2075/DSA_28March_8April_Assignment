package DSAAssg1;

public class Count1s {
    public static void main(String[] args) {
        int[][] a={{0,0,0,1,1},{0,0,1,1,1},{0,0,0,0,0},{0,1,1,1,1},{0,0,0,0,1}};
        int i=0;
        int row=-1;
        int j=a.length-1;
        while (i<=a.length-1 && j>=0){
            if(a[i][j]==1){
                row=i;
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("row index have maximum no of rows : " +row);
    }
}
