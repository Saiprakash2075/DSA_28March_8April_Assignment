package DSAAssg1;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] missingnum = twoSum(arr, target);
        System.out.println(missingnum);

    }

    /*public static int[] twosum(int[] arr, int target){
        int start=0;
        //int target=9;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid==target){
                return new int[]{mid};
            }
            if(mid<target){
                start=mid+1;
            }
            else{
                end=end-1;
            }
        }
        return new int[]{-1};
    }*/
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] < target) {
                left++;
            } else if (nums[left] + nums[right] > target) {
                right--;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }
        return new int[]{-1, -1};

    }
}
