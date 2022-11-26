package org.example;

import java.util.HashMap;
import java.util.Map;

//Given a roman numeral, convert it to an integer.

public class RomanToInteger {

  public static void main(String[] args) {

  }

  public static int romanToIntFirstSolution(String s) {

    final int I = 1;
    final int V = 5;
    final int X = 10;
    final int L = 50;
    final int C = 100;
    final int D = 500;
    final int M = 1000;

    char[] chars = s.toCharArray();
    int sum = 0;

    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == 'I') {
        if (i < chars.length - 1 && chars[i + 1] == 'V') {
          sum = sum + (V - I);
          i++;
        }
        else if (i < chars.length - 1 && chars[i + 1] == 'X') {
          sum = sum + (X - I);
          i++;
        }
        else {
          sum = sum + I;
        }
      }
      else if (chars[i] == 'X') {
        if (i < chars.length - 1 && chars[i + 1] == 'L') {
          sum = sum + (L - X);
          i++;
        }
        else if (i < chars.length - 1 && chars[i + 1] == 'C') {
          sum = sum + (C - X);
          i++;
        }
        else {
          sum = sum + X;
        }
      }
      else if (chars[i] == 'C') {
        if (i < chars.length - 1 && chars[i + 1] == 'D') {
          sum = sum + (D - C);
          i++;
        }
        else if (i < chars.length - 1 && chars[i + 1] == 'M') {
          sum = sum + (M - C);
          i++;
        }
        else {
          sum = sum + C;
        }
      }
      else if (chars[i] == 'V') {
        sum = sum + V;
      }
      else if (chars[i] == 'L') {
        sum = sum + L;
      }
      else if (chars[i] == 'D') {
        sum = sum + D;
      }
      else {
        sum = sum + M;
      }
    }
    return sum;
  }

  public static int romanToIntSecondSolution(String s) {

    Map<Character, Integer> roman = new HashMap<>();
    roman.put('I', 1);
    roman.put('V', 5);
    roman.put('X', 10);
    roman.put('L', 50);
    roman.put('C', 100);
    roman.put('D', 500);
    roman.put('M', 1000);

    char[] chars = s.toCharArray();
    int sum = 0;

    for (int i = 0; i < chars.length; i++) {
      if ((i + 1) < chars.length && roman.get(chars[i]) < roman.get(chars[i + 1])) {
        sum = sum - roman.get(chars[i]);
      }
      else {
        sum = sum + roman.get(chars[i]);
      }
    }

    return sum;
  }
}
