package DSAAssg1;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] a={1,3,5,7};
        int[] b={2,4,6,8};
        int i=a.length-1;
        int j=0;
        while(i>=0 && j<b.length){
            if(a[i]>=b[j]) {
                a[i] = a[i] * b[j];
                b[j] = a[i] / b[j];
                a[i] = a[i] / b[j];
            }
            i--;
            j++;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
