public class TimeNeedede {
    public static int timeRequiredToBuy(int[] nums, int k) {
        int out = 0;
        while(nums[k]!=0){
            for(int i=0; i<nums.length; i++){
                if(nums[i]>0){
                    nums[i] = nums[i]-1;
                    out++;
                    if(nums[k]==0){
                        break;
                    }
                }
            }
        }
        return out;
    }

    public static void main(String[] args) {
        int[] nums = {84,49,5,24,70,77,87,8};
        System.out.println(timeRequiredToBuy(nums,3));
    }
}
