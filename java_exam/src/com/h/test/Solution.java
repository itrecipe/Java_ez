package com.h.test;

public class Solution {
 public static void main(String[] args) {
	 Solution s =  new Solution();
	 int[] result = {2,7,11,15}; 
	 s.twoSum(result , 9);
}
 
 public int[] twoSum(int[] nums, int target) {
     
 	int[] result = new int[2];
 	
 	for(int i = 0; i<nums.length; i++) {
 		for(int j = 0; j<nums.length;j++) {
 			if((nums[i]+nums[j]==target) && !(i == j) && !(i < j)) {
 			System.out.println("i="+i + "j =" +j );
 			
 				result[0] = i;
 				result[1] = j;
 				
 			}
 		}
 	}
 	return result;
 	
 }
}