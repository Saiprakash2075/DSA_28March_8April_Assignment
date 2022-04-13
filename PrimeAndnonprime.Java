package DSAAssg1;

import java.util.Arrays;

public class PrimeAndNonprime {

    public static void main(String[] args) {
        int[] a={1,4,23,78,54,13,89};
        int left=0;
        int right=a.length-1;
        while(left<right){
           if(a[left]%2!=0){
               left++;
            }
           else if(a[right]%2==0){
               right--;
           }
           if(a[left]%2==0 && a[right]%2!=0){
               int temp=a[left];
               a[left]=a[right];
               a[right]=temp;
               left++;
               right--;
           }
        }
        System.out.println(Arrays.toString(a));
    }
}
