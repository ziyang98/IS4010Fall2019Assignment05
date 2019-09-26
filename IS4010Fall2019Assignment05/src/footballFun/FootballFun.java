/*
 * IS4010 Fal 2019
 * Assignment 05
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package footballFun;

public class FootballFun {

	public static void main(String[] args) {
		int correctCount = 0;
		if (translateScore(2).equals("safety") == true) { correctCount++;}
		if (translateScore(3).equals("field goal") == true) { correctCount++;}
		if (translateScore(6).equals("touchdown") == true) { correctCount++;}
		if (translateScore(7).equals("Touchdown and extra point") == true) { correctCount++;}
		if (translateScore(8).equals("Touchdown and 2-point conversion") == true) { correctCount++;}
		if (translateScore(-1).equals("") == true) { correctCount++;}
		
		if (correctCount == 6) {
			System.out.println("All tests passed");
		} else {
			System.out.println("At least one test failed");
		}
	}
	public static String translateScore (int score) {
		return "";
	}
}
