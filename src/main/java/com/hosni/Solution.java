package com.hosni;

import java.util.HashMap;

/**
 * @author hosni
 * @date 2019/09/12 13:12:09
 **/
public class Solution {
    public static void main(String[] args) {
        Solution st = new Solution();
        int[] b = {6, 7, 2, 7};
        int[] a = st.twoSum(b, 9);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];

        // 建立k-v ，一一对应的哈希表
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(nums[i])){
                indexs[0] = i;
                indexs[1] = hash.get(nums[i]);
                return indexs;
            }
            // 将数据存入 key为补数 ，value为下标
            hash.put(target-nums[i],i);
        }
        // // 双重循环 循环极限为(n^2-n)/2
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = nums.length - 1; j > i; j --){
        //         if(nums[i]+nums[j] == target){
        //            indexs[0] = i;
        //            indexs[1] = j;
        //            return indexs;
        //         }
        //     }
        // }
        return indexs;
    }
}
