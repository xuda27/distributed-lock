package com.xudaweb.distributed.lock.start;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

/**
 * @author xuda
 * @date 2018/10/13
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp = target - nums[i];
            if(map.containsKey(temp) && i != map.get(temp)){
                return new int[] {map.get(temp),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.twoSum(new int []{3,3},6));
        Predicate<String> aa = (String s) -> !s.isEmpty();
    }
}
