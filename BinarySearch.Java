package DSAAssg1;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int n=7;
      int s = search(arr,n);
      System.out.println(s);
    }
    public static int search(int[] arr,int n){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==n){
                System.out.println("found at array position");
                return mid;
            }
            if(n>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
           // return mid;
        }
        return -1;

    }
}
