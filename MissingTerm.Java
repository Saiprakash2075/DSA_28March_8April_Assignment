package DSAAssg1;

public class MissingTerm {
    public static int MissingTerm(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int dif = (nums[nums.length - 1] - nums[0]);
        while (start <= end) {
            int mid = end - (end - start) / 2;
            if (mid + 1 < nums.length && nums[mid + 1] - nums[mid] != dif) {
                return nums[mid + 1] - dif;
            }
            if (mid - 1 >= 0 && nums[mid] - nums[mid - 1] != dif) {
                return nums[mid - 1] + dif;
            }
            if (nums[mid] - nums[0] != (mid - 0) * dif) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
       
        public static void mian(String[] args){
            int[] nums={5,7,9,11,15};
            //String MissingTerm = null;
            System.out.println("mising number is : " +MissingTerm(nums));
            
        }
    
}
