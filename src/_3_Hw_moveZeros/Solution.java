package _3_Hw_moveZeros;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {

    static void moveZeroes(int[] nums) {

        //nums = [0,1,0,3,12]

        //Muharrem Bey`s solution:
        int nonZeroNumberIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[nonZeroNumberIndex] = nums[i];
                if(i!=nonZeroNumberIndex){
                    nums[i]=0;
                }
                nonZeroNumberIndex++;
            }
        }

        //My solution:
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i]==0 && nums[j]!=0){
//                    int zero = nums[i];
//                    nums[i]=nums[j];
//                    nums[j]=zero;
//                }
//            }
//        }
        // nums = [1,3,12,0,0]


    }


    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
