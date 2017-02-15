package com.jana.puzzles;

public class SwortPuzzle_Math {

  public static void main(String[] args) {
    int peopleCount = 100;

    int num = peopleCount;
    int min = 1;
    int max = peopleCount;
    int skipLevel = 1;
    while(min == max || max <= peopleCount) {
      min = min + skipLevel;
      skipLevel++;
      num = min;
      if(num < max) {
        min = num;
      }
      else {
        max = num;
      }
    }

    System.out.println(num);
  }

}