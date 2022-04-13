package DSAAssg1;

import java.util.Arrays;

public class InterSection {
    public static void main(String[] args) {
        int[] a={2,4,6,7,8,9};
        int[] b={2,5,6,9,9};
        if(a.length> b.length)
        {
            //b is smaller, so search elements of b in array a

            for(int i=0;i<b.length;i++) {
                //search bth element in array a

                int index = binarySearch(a, b[i]);

                if(index!=-1)
                {
                    System.out.println(b[i]);
                }


            }
        }

        else
        {
            // a is smaller, so search elements of a in array b

            for(int i=0;i<a.length;i++) {
                //search bth element in array a

                int index = binarySearch(b, a[i]);

                if(index!=-1)
                {
                    System.out.println(a[i]);
                }
            }
        }
    }

    public static int binarySearch(int [] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = start+(end-start)/2;

            if(arr[mid] == target)
            {
                return mid;
            }

            else if(target < arr[mid])
            {
                end = mid -1;
            }

            else
            {
                start = mid +1;
            }
        }

        return -1;
    }

}
