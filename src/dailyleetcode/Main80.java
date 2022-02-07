package dailyleetcode;

public class Main80 {
    class Solution {
        public int removeDuplicates(int[] nums) {
            if(nums==null){
                return 0;
            }

            if (nums.length <= 2){
                return nums.length;
            }

            int i = 1; // point to previous
            int j = 2; // point to current

            while (j < nums.length) {
                if (nums[j] == nums[i] && nums[j] == nums[i - 1]) {
                    j++;
                } else {
                    i++;
                    nums[i] = nums[j];
                    j++;
                }

            }

            return i + 1;
        }
    }
}
