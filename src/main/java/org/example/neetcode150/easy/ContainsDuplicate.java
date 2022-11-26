package org.example.neetcode150.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/*
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.
*/

public class ContainsDuplicate {

  public static void main(String[] args) {

  }

  public boolean containsDuplicate1(int[] nums) {

    for (int i = 0; i < nums.length; i++) {
      int n = nums[i];
      for (int j = i + 1; j < nums.length; j++) {
        if (n == nums[j]) {
          return true;
        }
      }
    }
    return false;
  }

  public boolean containsDuplicate2(int[] nums) {

    Set<Integer> set = Arrays.stream(nums)
        .boxed()
        .collect(Collectors.toSet());

    return set.size() != nums.length;
  }

  public boolean containsDuplicate3(int[] nums) {

    Set<Integer> set = new HashSet<>();

    for (int num : nums) {
      if (!set.add(num)) {
        return true;
      }
    }
    return false;
  }
}
