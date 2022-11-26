package org.example.neetcode150.easy;

// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

import java.util.Arrays;

public class ValidAnagram {

  public static void main(String[] args) {

  }

  public boolean isAnagram1(String s, String t) {

    if (s.length() != t.length()) {
      return false;
    }

    char[] sChars = s.toCharArray();
    char[] tChars = t.toCharArray();
    int sNumericValueSum = 0;
    int tNumericValueSum = 0;

    for (char sChar : sChars) {
      sNumericValueSum = sNumericValueSum + Character.getNumericValue(sChar);
    }

    for (char tChar : tChars) {
      tNumericValueSum = tNumericValueSum + Character.getNumericValue(tChar);
    }

    if (sNumericValueSum == tNumericValueSum) {
      Arrays.sort(sChars);
      Arrays.sort(tChars);

      for (int i = 0; i < s.length(); i++) {
        if (sChars[i] != tChars[i]) {
          return false;
        }
      }
      return true;
    }
    else {
      return false;
    }
  }

  public boolean isAnagram2(String s, String t) {

    if (s.length() != t.length()) {
      return false;
    }

    char[] charsS = s.toCharArray();
    char[] charsT = t.toCharArray();
    Arrays.sort(charsS);
    Arrays.sort(charsT);

    for (int i = 0; i < charsS.length; i++) {
      if (charsS[i] != charsT[i]) {
        return false;
      }
    }
    return true;
  }
}
