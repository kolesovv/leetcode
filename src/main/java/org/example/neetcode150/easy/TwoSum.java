package org.example.neetcode150.easy;

import java.util.HashMap;

/*
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
*/

public class TwoSum {

  public static void main(String[] args) {

  }

  public int[] twoSum1(int[] nums, int target) {

    int[] answer = new int[2];

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          answer[0] = i;
          answer[1] = j;
          return answer;
        }
      }
    }

    return answer;
  }

  public int[] twoSum2(int[] nums, int target) {

    int[] answer = new int[2];
    HashMap<Integer, Integer> hashMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      hashMap.put(nums[i], i);
    }

    for (int i = 0; i < nums.length; i++) {
      int pair = target - nums[i];
      if (hashMap.containsKey(pair) && hashMap.get(pair) != i) {
        answer[0] = i;
        answer[1] = hashMap.get(pair);
        return answer;
      }
    }
    return answer;
  }
}
