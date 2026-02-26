package day17maxStreak;

import java.util.Arrays;
import java.util.List;

public class MaxStreakProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> weeklogs=Arrays.asList("YYY","YYY","YNY","YYY","YNY");
calculateMaxStreak(weeklogs);
	}

	private static void calculateMaxStreak(List<String> weelogs) {
		// TODO Auto-generated method stub
		int currentStreak=0;
		int maxStreak=0;
		
		for(String data:weelogs) {
			//System.out.println(data);
			if(!data.contains("N")) {
				currentStreak=currentStreak+1;
				maxStreak=Math.max(currentStreak, maxStreak);
				
				
			}
			else {
				currentStreak=0;
			}
				
		}
		System.err.println(maxStreak);
		//System.err.println(data);
	}

}
