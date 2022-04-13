package DSAAssg1;

public class CubeRoot {
    public static void main(String[] args) {
        int n=7;
        double start=0;
        double end=n;
        double ans=0;
        while (start<=end){
            double mid=(start+end)/2;
            if(mid*mid*mid==n){
                System.out.println(mid);
            }
             if(n>mid*mid*mid){
                 start=mid+1;
                 ans=mid;
                 System.out.println(ans);
             }
             else{
                 end=end-1;
             }
        }
        System.out.println(Math.cbrt(7));
    }
}
