package day90sdetquestions;

import java.util.HashMap;

/** Compares competition scores for two participants by mapping 'E', 'M', and 'H' characters to weights 1, 3, and 5. */
public class Day27HackathonScoreCalculatorv1 {
    public static void main(String[] args) {
        String erica = "EEH";
        String bob = "HME";
        
        if (erica.length() != bob.length()) {
            System.err.println("Lenght of Erica and Bob should be same");
            System.exit(0);
        }


        // ScoreCard Map: O(1) lookup for difficulty weights
        HashMap<Character, Integer> scoreCard = new HashMap<Character, Integer>();
        scoreCard.put('E', 1);
        scoreCard.put('M', 3);
        scoreCard.put('H', 5);

        int erica_final_score = 0;
        int bob_final_score = 0;

        for (int i = 0; i < erica.length(); i++) {
            erica_final_score += scoreCard.get(erica.charAt(i));
            bob_final_score += scoreCard.get(bob.charAt(i));
        }

        if (erica_final_score > bob_final_score) {
            System.out.println("Winner is erica = " + erica_final_score);
        } else if (bob_final_score > erica_final_score) {
            System.out.println("Winner is Bob = " + bob_final_score);
        } else {
            System.out.println("Tie");
        }
    }
}
