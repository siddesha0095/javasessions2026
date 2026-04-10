package day90sdetquestions;

import java.util.*;

public class Day28RodCuttingSolution {
    public static void main(String[] args) {
        int rods[] = {1, 1, 3, 4}; // initial rod lengths

        Arrays.sort(rods); // sort rods to process smallest first

        ArrayList<Integer> rodList = new ArrayList<Integer>(); // list to hold current rods
        ArrayList<Integer> result = new ArrayList<Integer>(); // list to store cut counts
        for (int rod : rods) {
            rodList.add(rod); // add rods to list
        }

        System.out.println(rodList); // print initial rods

        while (!rodList.isEmpty()) { 
            result.add(rodList.size()); // record how many rods before cut
            int shortest = rodList.get(0); // find shortest rod

            ArrayList<Integer> next = new ArrayList<Integer>(); // list for next iteration

            for (int rod : rodList) {
                if (rod == shortest) {
                    // discard shortest rods
                }
                else {
                    next.add(rod - shortest); // cut longer rods by shortest length
                }
            }

            rodList = next; // update rod list for next round
        }

        System.out.println(result); // print cut counts after each round
    }
}
