import java.util.ArrayList;
// import java.util.Random;

public class PuzzleJavaTest {
    
    public static void main(String[] args) {
		
        PuzzleJava generator = new PuzzleJava();

		System.out.println();
        System.out.println("----- 10 Random Numbers between 1 and 20 -----");
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		System.out.println();
		
        System.out.println("----- Return one random letter -----");
        
        // ArrayList<Character> alphabet = {'A','B','C'};
        // char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'}; 
    	System.out.println(generator.getOneLetter());
    	System.out.println();
        
        System.out.println("----- Generate a random 8 character password -----");
        // String password = "";
        // for (int i = 1; i <= 8; i++) {
        //     char randomLetter = generator.getOneLetter();
        //     password += randomLetter;
        // }
        System.out.println(generator.randomPassword());
        System.out.println();

        System.out.println("----- Generate X amount of random 8 character words -----");
        System.out.println(generator.getNewPasswordSet(5));
        System.out.println();
	}


}

