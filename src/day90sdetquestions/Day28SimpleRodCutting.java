package day90sdetquestions;

import java.util.*;

public class Day28SimpleRodCutting {
    public static void main(String[] args) {
        int rods[] = {1, 1, 3, 4}; // initial rod lengths

        Arrays.sort(rods); // sort rods

        List<Integer> rodList = new ArrayList<>();
        for (int rod : rods) {
            rodList.add(rod);
        }

        List<Integer> result = new ArrayList<>();

        // Simulation: cut rods until none remain
        while (!rodList.isEmpty()) {
            result.add(rodList.size()); // record rods before cut
            int shortest = rodList.get(0); // find shortest rod

            List<Integer> next = new ArrayList<>();
            for (int rod : rodList) {
                if (rod > shortest) {
                    next.add(rod - shortest); // subtract shortest from longer rods
                }
                // rods equal to shortest are discarded
            }
            Collections.sort(next); // keep list sorted for next round
            rodList = next;
        }

        System.out.println(result); // output: [4, 2, 1]
    }
}
