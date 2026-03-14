package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * CLASS PURPOSE:
 * ---------------------------------------------------------
 * This program compares the performance of ArrayList and LinkedList
 * for three major operations:
 *
 * 1. ADD operation
 * 2. GET (read) operation
 * 3. REMOVE operation
 *
 * The execution time is measured using System.nanoTime()
 * which gives time in nanoseconds.
 *
 * WHY nanoTime():
 * Because collection operations are extremely fast,
 * so milliseconds are not precise enough.
 *
 * ---------------------------------------------------------
 * INTERVIEW INSIGHT:
 * ---------------------------------------------------------
 * Interviewers commonly ask:
 *
 * 1. Difference between ArrayList and LinkedList
 * 2. Which one is faster for insertion?
 * 3. Which one is faster for retrieval?
 * 4. Internal data structure of both
 *
 * This program demonstrates those differences practically.
 */

public class PerformanceOfList {

    public static void main(String[] args) {

        /**
         * BEST PRACTICE:
         * Always program to an interface (List) instead of implementation.
         * This allows easy switching between ArrayList / LinkedList.
         */
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        int size = 100000;

        /* ------------------------------------------------
           ARRAYLIST ADD OPERATION
           ------------------------------------------------ */

        long startTime = System.nanoTime();

        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }

        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("ArrayList add: " + duration);


        /* ------------------------------------------------
           LINKEDLIST ADD OPERATION
           ------------------------------------------------ */

        startTime = System.nanoTime();

        for (int i = 0; i < size; i++) {
            linkedList.add(i);
        }

        endTime = System.nanoTime();

        duration = endTime - startTime;

        System.out.println("LinkedList add: " + duration);


        /* ------------------------------------------------
           ARRAYLIST GET OPERATION
           ------------------------------------------------ */

        startTime = System.nanoTime();

        for (int i = 0; i < size; i++) {
            arrayList.get(i);
        }

        endTime = System.nanoTime();

        duration = endTime - startTime;

        System.out.println("ArrayList get: " + duration);


        /* ------------------------------------------------
           LINKEDLIST GET OPERATION
           ------------------------------------------------ */

        startTime = System.nanoTime();

        for (int i = 0; i < size; i++) {
            linkedList.get(i);
        }

        endTime = System.nanoTime();

        duration = endTime - startTime;

        System.out.println("LinkedList get: " + duration);


        /* ------------------------------------------------
           ARRAYLIST REMOVE OPERATION
           ------------------------------------------------ */

        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            arrayList.remove(0);
        }

        endTime = System.nanoTime();

        duration = endTime - startTime;

        System.out.println("ArrayList remove: " + duration);


        /* ------------------------------------------------
           LINKEDLIST REMOVE OPERATION
           ------------------------------------------------ */

        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            linkedList.remove(0);
        }

        endTime = System.nanoTime();

        duration = endTime - startTime;

        System.out.println("LinkedList remove: " + duration);

    }
}

/*ArrayList add: 10171600
LinkedList add: 6941300
ArrayList get: 1887200
LinkedList get: 4575493700
ArrayList remove: 107000000
LinkedList remove: 1077500 */

