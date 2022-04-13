package DSAAssg1;

public class SetMatrixToOne {
    public static void main(String[] args) {
        //int[][] a={{1,0},{0,0}};
        //int[][] a={{0,0,0},{0,0,1}};
        int[][] a = {{1, 0, 0, 1}, {0, 0, 1, 0}, {0, 0, 0, 0}};

        boolean found = false;
        int row = -1;
        int col = -1;
//int cloSize=a[0].length;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == 1) {
                    found = true;
                    row = i;
                    col = j;
                    break;
                }
            }

            break;
        }

        if (found == true) {
            for (int j = 0; j < a.length; j++) {
                a[row][j] = 1;
            }
            for (int i = 0; i < a.length; i++) {
                a[i][col] = 1;
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
 }
