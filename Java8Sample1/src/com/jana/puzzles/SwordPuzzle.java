package com.jana.puzzles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Problem statement:
 *
 * 100 people standing in a circle in an order 1 to 100. No.1 has a sword. He kills next person (i.e. no. 2) and gives
 * sword to next to next (i.e no.3). This will go on (Guy kills next one and hand over sword to the next person who is
 * alive), this will continue until only 1 survives. Finding the person number who survives at the end is the problem.
 *
 *
 * @author janareddy
 *
 */

// TESTED in Java 8
// TODO we need to convert this to Java8 and see the performance diff
public class SwordPuzzle {

  public static void main(String[] args) {
    startAlgorithm(100);

    // Test Performance
    // int mult = 1;
    // for(int i = 1; i < 12; i++) {
    // runCount(mult);
    // mult = mult * 10;
    // }
  }

  private static void startAlgorithm(int peopleCount) {
    long startTime = System.currentTimeMillis();

    List<Integer> people = new ArrayList<>();

    // Create People List
    for(int i = 1; i <= peopleCount; i++) {
      people.add(new Integer(i));
    }

    System.out.println("The Result : " + killTheNextPerson(people, false, 0));
    System.out.println("Time took for " + peopleCount + " people is : " + (System.currentTimeMillis() - startTime)
      + " Milli Sec.");
  }

  /**
   * This is a recursive method which will take all the alive people and start killing the neighbor and handle the sword
   * to next guy. This creates new list of alive people for the next round with killFirstPerson. if killFirstPerson is
   * true then it skips add the first guy because last guy in the previous had the sword.
   *
   * @param people
   * @param killFirstPerson
   * @param round
   *          - this is just for display purpose.
   * @return Final Alive Person
   */
  private static Integer killTheNextPerson(List<Integer> people, boolean killFirstPerson, int round) {
    if(people.size() == 1) {
      return people.get(0);
    }

    List<Integer> nextRoundpeople = new ArrayList<>();

    for(Iterator<Integer> iterator = people.iterator(); iterator.hasNext();) {
      if(killFirstPerson) {
        if(iterator.hasNext()) {
          iterator.next();
        }

        if(iterator.hasNext()) {
          nextRoundpeople.add(iterator.next());
        }
        else {
          killFirstPerson = false;
        }
      }
      else {
        nextRoundpeople.add(iterator.next());
        if(iterator.hasNext()) {
          iterator.next();
        }
        else {
          killFirstPerson = true;
        }
      }

    }

    // System.out.println(" Round " + ++round + " " + nextRoundpeople);
    people = null; // Garbage collection
    return killTheNextPerson(nextRoundpeople, killFirstPerson, round);
  }

}